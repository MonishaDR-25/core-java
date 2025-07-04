package com.xworkz.runner;

import com.xworkz.lambda.BiConsumer;

public class BiConsumerRunner {
    public static void main(String[] args) {

        BiConsumer<String, Double> discountApplier = (product, discount) -> {
            if (discount >= 10.0) {
                System.out.println("Applying discount of " + discount + "% on " + product);
            } else {
                System.out.println("No significant discount on " + product);
            }
        };

        discountApplier.accept("Refrigerator", 15.0);
        discountApplier.accept("Book", 5.0);
    }
}
