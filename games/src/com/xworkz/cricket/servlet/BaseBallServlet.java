package com.xworkz.cricket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/baseball", loadOnStartup = 1)
public class BaseBallServlet extends GenericServlet {
    public BaseBallServlet() {
        System.out.println("Created BaseballServlet...");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running service in BaseballServlet...");
    }
}
