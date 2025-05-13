package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fill", loadOnStartup =1)
public class AppointmentServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Appointment Form");
        String FirstName = servletRequest.getParameter("firstName");
        String LastName = servletRequest.getParameter("lastName");
        String Email = servletRequest.getParameter("email");
        String Age = servletRequest.getParameter("age");
        String Address = servletRequest.getParameter("address");
        String Address2 = servletRequest.getParameter("address2");
        String City = servletRequest.getParameter("city");
        String State = servletRequest.getParameter("state");
        String Gender = servletRequest.getParameter("gender");
        String Sickness = servletRequest.getParameter("sickness");
        String Contact = servletRequest.getParameter("contact");
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>Thanks For Booking Your Appointment</h1>");
        writer.println("<p>First Name:" +FirstName+ "</p>");
        writer.println("<p>Last Name:"+LastName+ "</p>");
        writer.println("<p>Email:" +Email+ "</p>");
        writer.println("<p>Age:" +Age+ "</p>");
        writer.println("<p>Address:" +Address+ "</p>");
        writer.println("<p>Address2:" +Address2+ "</p>");
        writer.println("<p>City:" +City+ "</p>");
        writer.println("<p>State:" +State+ "</p>");
        writer.println("<p>Gender:" +Gender+"</p>");
        writer.println("<p>Sickness:" +Sickness+ "</p>");
        writer.println("<p>Contact:" +Contact+ "</p>");
        writer.println("</body></html>");
    }
}