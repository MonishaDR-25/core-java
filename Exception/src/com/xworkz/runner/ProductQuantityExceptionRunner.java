package com.xworkz.runner;

import com.xworkz.exceptions.ProductQuantityException;

public class ProductQuantityExceptionRunner {
    public static void main(String[] args) {
        int quantity=12;
        int max_quantity=1000;
        if (quantity < 0) {
            throw new ProductQuantityException("Quantity must be zero or more.");
        }

        if (quantity > max_quantity) {
            throw new ProductQuantityException("Quantity cannot exceed warehouse limit of " + max_quantity + " units.");
        }

        System.out.println("Valid Quantity: " + quantity);
    }

}
