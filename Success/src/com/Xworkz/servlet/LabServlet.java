package com.Xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/lab", loadOnStartup = 1)
public class LabServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Laboratory Form");
        String name = req.getParameter("name");
        String test = req.getParameter("test");
        String date = req.getParameter("date");
        String location = req.getParameter("location");

        System.out.println("Forwarding to Lab success page");
        RequestDispatcher dispatcher = req.getRequestDispatcher("labSuccess.jsp");
        dispatcher.forward(req, res);
    }
}
