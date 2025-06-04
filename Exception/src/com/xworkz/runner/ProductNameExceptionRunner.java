package com.xworkz.runner;

import com.xworkz.exceptions.ProductNameException;

public class ProductNameExceptionRunner {
    public static void main(String[] args) {
        String productName="ab";
        if (productName == null || productName.trim().isEmpty()) {
            throw new ProductNameException("Product name cannot be null or empty.");
        }

        if (productName.trim().length() < 3) {
            throw new ProductNameException("Product name must be at least 3 characters long.");
        }

        System.out.println("Valid Product Name: " + productName);
    }
}
