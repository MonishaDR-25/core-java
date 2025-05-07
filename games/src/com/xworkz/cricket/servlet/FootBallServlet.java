package com.xworkz.cricket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/football", loadOnStartup = 1)
public class FootBallServlet extends GenericServlet {
    public FootBallServlet() {
        System.out.println("Created FootBallServlet...");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running service in FootBallServlet...");
    }
}
