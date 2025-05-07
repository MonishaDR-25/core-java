package com.xworkz.cricket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/volleyball", loadOnStartup = 1)
public class VolleyBallServlet extends GenericServlet {
    public VolleyBallServlet() {
        System.out.println("Created VolleyBallServlet...");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running service in VolleyBallServlet...");
    }
}
