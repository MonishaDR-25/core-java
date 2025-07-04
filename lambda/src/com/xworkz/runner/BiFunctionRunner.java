package com.xworkz.runner;

import com.xworkz.lambda.BiFunction;

public class BiFunctionRunner {
    public static void main(String[] args) {
        BiFunction<Double, Integer, Double> totalCost = (price, quantity) -> price * quantity;

        System.out.println("Total cost: " + totalCost.apply(199.99, 3));
    }
}
