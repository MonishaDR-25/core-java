package com.xworkz.namingCeremony.servlet;

import com.xworkz.namingCeremony.dto.NamingCeremonyDto;
import com.xworkz.namingCeremony.service.NamingCeremonyService;
import com.xworkz.namingCeremony.service.NamingCeremonyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

@WebServlet(urlPatterns = {"/event", "/eventViewer"}, loadOnStartup = 1)
public class NamingCeremonyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String childName = req.getParameter("childName");
        String location = req.getParameter("location");

        String guestParam = req.getParameter("numberOfGuests");
        int numberOfGuests = 0;
        if (guestParam != null) {
            numberOfGuests = Integer.parseInt(guestParam);
        }

        String dateParam = req.getParameter("ceremonyDate");
        LocalDate ceremonyDate = null;
        if (dateParam != null) {
            ceremonyDate = LocalDate.parse(dateParam);
        }

        String decoratedParam = req.getParameter("decorated");
        boolean decorated = decoratedParam != null && decoratedParam.equalsIgnoreCase("true");

        NamingCeremonyDto namingCeremonyDto = new NamingCeremonyDto();
        namingCeremonyDto.setChildName(childName);
        namingCeremonyDto.setLocation(location);
        namingCeremonyDto.setNumberOfGuests(numberOfGuests);
        namingCeremonyDto.setCeremonyDate(ceremonyDate);
        namingCeremonyDto.setDecorated(decorated);

        NamingCeremonyService service = new NamingCeremonyServiceImpl();
        boolean valid = service.save(namingCeremonyDto);

        if (valid) {
            System.out.println("service done successfully");
            req.setAttribute("success", "Event details saved successfully!");
        } else {
            System.out.println("not saved");
            req.setAttribute("dto", namingCeremonyDto);
            req.setAttribute("failure", "Event details not saved.");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/event.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running get in NamingCeremonyServlet..");
        String eventIdParam = req.getParameter("childId");

        if (eventIdParam != null) {
            int id = Integer.parseInt(eventIdParam);
            System.out.println("search id: " + id);

            NamingCeremonyService service = new NamingCeremonyServiceImpl();
            Optional<NamingCeremonyDto> optional = service.findById(id);

            if (optional.isPresent()) {
                NamingCeremonyDto namingCeremonyDto = optional.get();
                System.out.println("event data is found: " + namingCeremonyDto);
                req.setAttribute("dto", namingCeremonyDto);
            } else {
                System.out.println("event data not found for id: " + id);
                req.setAttribute("failure", "Event data not found for ID: " + id);
            }

            RequestDispatcher dispatcher = req.getRequestDispatcher("EventViewer.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
