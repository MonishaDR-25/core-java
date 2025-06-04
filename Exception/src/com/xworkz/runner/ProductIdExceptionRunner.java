package com.xworkz.runner;

import com.xworkz.exceptions.ProductIdException;

public class ProductIdExceptionRunner {
    public static void main(String[] args) {
        int productId = -5;

        if (productId <= 0) {
            throw new ProductIdException("Product ID must be a positive integer.");
        }

        System.out.println("Valid Product ID: " + productId);
    }
}
