package com.xworkz.runner;

import com.xworkz.lambda.DoubleToIntFunction;

public class DoubleToIntFunctionRunner {
    public static void main(String[] args) {
        DoubleToIntFunction toInt = val -> (int) Math.round(val);

        System.out.println(toInt.applyAsInt(5.8));
    }
}
