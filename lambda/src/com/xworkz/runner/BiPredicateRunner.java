package com.xworkz.runner;

import com.xworkz.lambda.BiPredicate;

public class BiPredicateRunner {
    public static void main(String[] args) {
        BiPredicate<Double, Double> isGreater = (a, b) -> a > b;

        System.out.println(isGreater.test(10.5, 5.2));
        System.out.println(isGreater.test(4.0, 9.0));
    }
}
