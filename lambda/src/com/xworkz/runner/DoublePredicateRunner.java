package com.xworkz.runner;

import com.xworkz.lambda.DoublePredicate;

public class DoublePredicateRunner {
    public static void main(String[] args) {
        DoublePredicate isPositive = val -> val > 0;

        System.out.println(isPositive.test(10.0));
        System.out.println(isPositive.test(-2.5));
    }
}
