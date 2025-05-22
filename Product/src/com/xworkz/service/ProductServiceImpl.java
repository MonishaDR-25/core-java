package com.xworkz.service;

import com.xworkz.dto.ProductDto;
import com.xworkz.repository.ProductRepository;
import com.xworkz.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

    @Override
    public boolean save(ProductDto productDto) {
        System.out.println("Saving ProductDto in ProductServiceImpl: " + productDto);

        if (productDto != null) {
            System.out.println("ProductDto is not null");

            String name = productDto.getName();
            if (name != null && name.length() >= 3 && name.length() <= 20) {
                System.out.println("Product name is valid");
            } else {
                System.err.println("Product name is invalid");
                return false;
            }

            String type = productDto.getType();
            if (type != null && !type.isEmpty()) {
                System.out.println("Type is valid");
            } else {
                System.err.println("Type is invalid");
                return false;
            }

            double incomingPrice = productDto.getIncomingPrice();
            if (incomingPrice > 1 && incomingPrice < 100) {
                System.out.println("Incoming price is valid");
            } else {
                System.err.println("Incoming price is invalid");
                return false;
            }

            double sellingPrice = productDto.getSellingPrice();
            if (sellingPrice > 1 && sellingPrice < 100) {
                System.out.println("Selling price is valid");
            } else {
                System.err.println("Selling price is invalid");
                return false;
            }

            double mrp = productDto.getMrp();
            if (mrp > 1 && mrp < 100) {
                System.out.println("MRP is valid");
            } else {
                System.err.println("MRP is invalid");
                return false;
            }

            String description = productDto.getDescription();
            if (description != null && description.length() >= 3 && description.length() <= 20) {
                System.out.println("Description is valid");
            } else {
                System.err.println("Description is invalid");
                return false;
            }

            String brand = productDto.getBrand();
            if (brand != null && brand.length() >= 3 && brand.length() <= 20) {
                System.out.println("Brand is valid");
            } else {
                System.err.println("Brand is invalid");
                return false;
            }

            int quantity = productDto.getQuantity();
            if (quantity >= 1 && quantity <= 100) {
                System.out.println("Quantity is valid");
            } else {
                System.err.println("Quantity is invalid");
                return false;
            }

            String color = productDto.getColor();
            if (color != null && !color.isEmpty()) {
                System.out.println("Color is valid");
            } else {
                System.err.println("Color is invalid");
                return false;
            }

            double weight = productDto.getWeight();
            if (weight >= 1 && weight <= 100) {
                System.out.println("Weight is valid");
            } else {
                System.err.println("Weight is invalid");
                return false;
            }

            String manufDate = productDto.getManufDate();
            if (manufDate != null && !manufDate.isEmpty()) {
                System.out.println("Manufacture date is valid");
            } else {
                System.err.println("Manufacture date is invalid");
                return false;
            }

            String warranty = productDto.getWarranty();
            if (warranty != null && !warranty.isEmpty()) {
                System.out.println("Warranty is valid");
            } else {
                System.err.println("Warranty is invalid");
                return false;
            }

            String returnPolicy = productDto.getReturnPolicy();
            if (returnPolicy != null) {
                System.out.println("Return policy is noted");
            } else {
                System.err.println("Return policy not selected");
                return false;
            }

        } else {
            System.err.println("ProductDto is null");
            return false;
        }
        ProductRepository productRepository=new ProductRepositoryImpl();
        productRepository.persist(productDto);


        System.out.println("Product data is good...");
        return true;
    }

}
