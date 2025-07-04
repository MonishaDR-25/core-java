package com.xworkz.runner;

import com.xworkz.lambda.DoubleBinaryOperator;

public class DoubleBinaryOperatorRunner {
    public static void main(String[] args) {
        DoubleBinaryOperator add = (a, b) -> a + b;

        System.out.println(add.applyAsDouble(5.5, 4.5));
    }
}
