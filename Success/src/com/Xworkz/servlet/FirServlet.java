package com.Xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/fir", loadOnStartup = 1)
public class FirServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("FIR Form");
        String name = req.getParameter("name");
        String contact = req.getParameter("contact");
        String firno = req.getParameter("firno");
        String description = req.getParameter("description");

        System.out.println("Forwarding to FIR success page");
        RequestDispatcher dispatcher = req.getRequestDispatcher("firSuccess.jsp");
        dispatcher.forward(req, res);
    }
}