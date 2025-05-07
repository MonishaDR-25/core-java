package com.xworkz.cricket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/badminton", loadOnStartup = 1)
public class BadmintonServlet extends GenericServlet {
    public BadmintonServlet() {
        System.out.println("Created BadmintonServlet...");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running service in BadmintonServlet...");
    }
}
