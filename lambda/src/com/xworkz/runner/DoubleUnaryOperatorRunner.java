package com.xworkz.runner;

import com.xworkz.lambda.DoubleUnaryOperator;

public class DoubleUnaryOperatorRunner {
    public static void main(String[] args) {
        DoubleUnaryOperator half = x -> x / 2;

        System.out.println(half.applyAsDouble(20.0));
    }
}
