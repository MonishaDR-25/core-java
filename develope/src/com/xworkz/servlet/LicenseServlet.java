package com.xworkz.servlet;

import dto.LicenseDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/license",loadOnStartup = 1)
public class LicenseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running servlet in Tomcat");

        String name = req.getParameter("name");
        String contactNumber = req.getParameter("contactNumber");
        String fatherName = req.getParameter("fatherName");
        String adharNumber = req.getParameter("adharNumber");
        String address = req.getParameter("address");

        req.setAttribute("message","Save Success");
        req.setAttribute("name",name);
        req.setAttribute("contactNumber",contactNumber);
        req.setAttribute("fatherName",fatherName);
        req.setAttribute("adharNumber",adharNumber);
        req.setAttribute("address",address);

        LicenseDto licenseDto= new LicenseDto();
        licenseDto.setName(name);
        licenseDto.setContactNumber(contactNumber);
        licenseDto.setFatherName(fatherName);
        licenseDto.setAdharNumber(adharNumber);
        licenseDto.setAddress(address);

        req.setAttribute("message", "Save Success");
        req.setAttribute("dto", licenseDto);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("licenseSuccess.jsp");
        requestDispatcher.forward(req,resp);

    }
}
