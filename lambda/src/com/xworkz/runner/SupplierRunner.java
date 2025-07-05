package com.xworkz.runner;

import com.xworkz.lambda.Supplier;

public class SupplierRunner {
    public static void main(String[] args) {
        Supplier<String> isEvenNumber=() ->{
            return "this is the data I am returning";
        };
        System.out.println(isEvenNumber.get());
    }
}
