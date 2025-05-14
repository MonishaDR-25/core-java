package com.Xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/license", loadOnStartup = 1)
public class LicenseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("License Form");
        String name = req.getParameter("name");
        String licenseno = req.getParameter("licenseno");
        String issue = req.getParameter("issue");
        String expiry = req.getParameter("expiry");

        System.out.println("Forwarding to License success page");
        RequestDispatcher dispatcher = req.getRequestDispatcher("licenseSuccess.jsp");
        dispatcher.forward(req, res);
    }
}