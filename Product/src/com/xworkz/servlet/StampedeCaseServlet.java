package com.xworkz.servlet;

import com.xworkz.dto.StampedeCaseDto;
import com.xworkz.repository.StampedeCaseRepository;
import com.xworkz.repository.StampedeCaseRepositoryImpl;
import com.xworkz.service.StampedeCaseService;
import com.xworkz.service.StampedeCaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/stampede", loadOnStartup = 1)
public class StampedeCaseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String event=req.getParameter("event");
       String location=req.getParameter("location");
     String deaths= req.getParameter("deaths");
        String injuries = req.getParameter("injuries");

        StampedeCaseDto stampedeCaseDto=new StampedeCaseDto();
        stampedeCaseDto.setEvent(event);
        stampedeCaseDto.setLocation(location);
        stampedeCaseDto.setNoOfDeaths(deaths);
        stampedeCaseDto.setNoOfInjuries(injuries);

        StampedeCaseRepository stampedeCaseRepository = new StampedeCaseRepositoryImpl();
        String result = stampedeCaseRepository.persist(stampedeCaseDto);


        resp.setContentType("text/html");
        resp.getWriter().write("<h2>Data Insert Result: " + result + "</h2>");


    }
}
