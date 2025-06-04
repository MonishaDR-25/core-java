package com.xworkz.runner;

import com.xworkz.exceptions.ProductPriceException;

public class ProductPriceExceptionRunner {
    public static void main(String[] args) {
        double price = 12000;
        final double max_price = 10000;

        if (price <= 0) {
            throw new ProductPriceException("Price must be greater than 0.");
        }

        if (price > max_price) {
            throw new ProductPriceException("Price must not exceed " + max_price);
        }

        System.out.println("Valid Price" + price);
    }
}
