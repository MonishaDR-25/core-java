package com.xworkz.runner;

import com.xworkz.exceptions.ProductCategoryException;

public class ProductCategoryExceptionRunner {
    public static void main(String[] args) {
        String category = "Food";
        String[] validCategories = {"Electronics", "Clothing", "Books", "Home"};

        boolean isValid = false;
        for (String validCategory : validCategories) {
            if (validCategory.equalsIgnoreCase(category)) {
                isValid = true;
                break;
            }
        }

        if (!isValid) {
            throw new ProductCategoryException("Category must be one of: Electronics, Clothing, Books, Home.");
        }

        System.out.println("Valid Category: " + category);
    }
}
