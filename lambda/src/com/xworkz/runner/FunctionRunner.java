package com.xworkz.runner;

import com.xworkz.lambda.Function;

public class FunctionRunner {
    public static void main(String[] args) {
        Function<Integer, String> integerToString=(Integer num)-> {
            String output=num.toString();
            return output;
        } ;
        System.out.println(integerToString.apply(64));
    }
}
