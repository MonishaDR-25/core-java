package com.xworkz.runner;

import com.xworkz.lambda.DoubleToLongFunction;

public class DoubleToLongFunctionRunner {
    public static void main(String[] args) {
        DoubleToLongFunction toLong = val -> (long) Math.floor(val);

        System.out.println(toLong.applyAsLong(99.99));
    }
}
