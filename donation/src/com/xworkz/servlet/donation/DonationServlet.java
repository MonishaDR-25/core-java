package com.xworkz.servlet.donation;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate",loadOnStartup = 1)
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
         System.out.println("Donation Form");
        String Name = servletRequest.getParameter("name");
        String Email = servletRequest.getParameter("email");
        String Location=servletRequest.getParameter("location");
        String DonationAmount=servletRequest.getParameter("donatinamount");

        System.out.println("String Chaining using RequestDispatcher using servlet/jsp");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("donationSuccess.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}

