package com.xworkz.servlet;


import com.xworkz.dto.ProductDto;
import com.xworkz.repository.ProductRepository;
import com.xworkz.repository.ProductRepositoryImpl;
import com.xworkz.service.ProductService;
import com.xworkz.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/product", loadOnStartup = 1)
public class ProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        int incomingPrice = Integer.parseInt(req.getParameter("incomingPrice"));
        int sellingPrice = Integer.parseInt(req.getParameter("sellingPrice"));
        int mrp = Integer.parseInt(req.getParameter("mrp"));
        String description = req.getParameter("description");
        String brand = req.getParameter("brand");
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        String color = req.getParameter("color");
        int weight = Integer.parseInt(req.getParameter("weight"));
        String manufDate = req.getParameter("manufDate");
        String warranty = req.getParameter("warranty");
        String returnPolicy = req.getParameter("returnPolicy");

        ProductDto productDto = new ProductDto();
        productDto.setName(name);
        productDto.setType(type);
        productDto.setIncomingPrice(incomingPrice);
        productDto.setSellingPrice(sellingPrice);
        productDto.setMrp(mrp);
        productDto.setDescription(description);
        productDto.setBrand(brand);
        productDto.setQuantity(quantity);
        productDto.setColor(color);
        productDto.setWeight(weight);
        productDto.setManufDate(manufDate);
        productDto.setWarranty(warranty);
        productDto.setReturnPolicy(returnPolicy);

        ProductService service = new ProductServiceImpl();
        boolean saved = service.save(productDto);


        if (saved) {
            req.setAttribute("message", "Product Saved Successfully");
            req.setAttribute("com/xworkz/dto", productDto);
            req.getRequestDispatcher("ProductSuccess.jsp").forward(req, resp);
        } else {
            req.setAttribute("message", "Saving Product Failed");
            req.getRequestDispatcher("Product.jsp").forward(req, resp);
        }

    }
}

