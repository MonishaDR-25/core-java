package com.xworkz.runner;

import com.xworkz.lambda.BinaryOperator;

public class BinaryOperatorRunner {
    public static void main(String[] args) {
        BinaryOperator<String> display = (a) -> a;

        System.out.println("Sum: " + display.apply("This is an Lambda Expression"));
    }
}
