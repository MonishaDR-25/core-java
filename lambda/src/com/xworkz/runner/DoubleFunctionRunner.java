package com.xworkz.runner;

import com.xworkz.lambda.DoubleFunction;

public class DoubleFunctionRunner {
    public static void main(String[] args) {
        DoubleFunction<String> convertToString = val -> "Value is: " + val;

        System.out.println(convertToString.apply(7.25));
    }
}
