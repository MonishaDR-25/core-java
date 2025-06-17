package com.xworkz.servlet;

import com.xworkz.dto.SoapDto;
import com.xworkz.repository.SoapRepository;
import com.xworkz.repository.SoapRepositoryImpl;
import com.xworkz.service.SoapService;
import com.xworkz.service.SoapServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

@WebServlet(urlPatterns = {"/soap","/search"}, loadOnStartup = 1)
public class SoapServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name=req.getParameter("name");
        String brand= req.getParameter("brand");
        String price=req.getParameter("price");
        String manufactureDate=req.getParameter("manufactureDate");
        String fragrant=req.getParameter("fragrant");
        String color=req.getParameter("color");

        SoapDto soapDto=new SoapDto();

        soapDto.setName(name);
        soapDto.setBrand(brand);
        soapDto.setPrice(Double.parseDouble(price));
        soapDto.setManufactureDate(LocalDate.parse(manufactureDate));
        soapDto.setFragrant(Boolean.parseBoolean(fragrant));
        soapDto.setColor(color);

        SoapRepository soapRepository=new SoapRepositoryImpl();
        String result=soapRepository.persist(soapDto);

        resp.setContentType("text/html");
        resp.getWriter().write("<h2>Soap Data Insert Result: " + result + "</h2>");


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running get in SoapServlet");
        String soapId=req.getParameter("soapId");
        if(soapId!=null){
            int id=Integer.parseInt(soapId);
            System.out.println("search id"+id);
            SoapService soapService=new SoapServiceImpl();
            Optional<SoapDto> optionalSoapDto=soapService.findById(id);
            if(optionalSoapDto.isPresent()){
                System.out.println("soap data is found");
            }
            else{
                System.out.println("soap data is not found for id:"+id);
            }
        }
    }
}
