package com.xworkz.runner;

import com.xworkz.lambda.DoubleConsumer;

public class DoubleConsumerRunner {
    public static void main(String[] args) {
        DoubleConsumer printSquare = value -> System.out.println("Square: " + (value * value));

        printSquare.accept(3.0);
    }
}
