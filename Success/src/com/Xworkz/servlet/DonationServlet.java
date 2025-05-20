package com.Xworkz.servlet;

import dto.DonationDto;
import service.DonationService;
import service.DonationServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donation", loadOnStartup = 1)
public class DonationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running DonationServlet in Tomcat");

        String donorName = req.getParameter("donorName");
        String email = req.getParameter("email");
        String purpose = req.getParameter("purpose");
       double amount = Double.parseDouble(req.getParameter("amount"));

        DonationDto dto = new DonationDto();
        dto.setDonorName(donorName);
        dto.setEmail(email);
        dto.setPurpose(purpose);
        dto.setAmount(amount);

        DonationService service = new DonationServiceImpl();
        boolean saved = service.save(dto);

        if (saved) {
            req.setAttribute("message", "Donation Saved Successfully");
            req.setAttribute("dto", dto);
            RequestDispatcher dispatcher = req.getRequestDispatcher("donationSuccess.jsp");
            dispatcher.forward(req, resp);
        } else {
            req.setAttribute("message", "Saving Donation Failed");
            RequestDispatcher dispatcher = req.getRequestDispatcher("donation.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
