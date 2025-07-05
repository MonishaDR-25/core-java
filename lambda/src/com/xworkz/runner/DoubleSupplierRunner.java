package com.xworkz.runner;

import com.xworkz.lambda.DoubleSupplier;

public class DoubleSupplierRunner {
    public static void main(String[] args) {
        DoubleSupplier piValue = () -> 3.14159;

        System.out.println("PI: " + piValue.getAsDouble());
    }

}
