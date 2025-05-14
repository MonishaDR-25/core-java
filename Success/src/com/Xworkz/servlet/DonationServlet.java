package com.Xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Donation Form");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String location = req.getParameter("location");
        String amount = req.getParameter("donatinamount");

        System.out.println("String Chaining using RequestDispatcher using servlet/jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher("donationSuccess.jsp");
        dispatcher.forward(req, res);
    }
}

