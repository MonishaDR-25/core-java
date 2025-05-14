package com.Xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback", loadOnStartup = 1)
public class FeedbackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Feedback Form");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String rating = req.getParameter("rating");
        String message = req.getParameter("message");

        System.out.println("Forwarding to Feedback success page");
        RequestDispatcher dispatcher = req.getRequestDispatcher("feedbackSuccess.jsp");
        dispatcher.forward(req, res);
    }
}
