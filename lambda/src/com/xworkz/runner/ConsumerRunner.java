package com.xworkz.runner;

import com.xworkz.lambda.Consumer;

public class ConsumerRunner {
    public static void main(String[] args) {

        Consumer<Integer> loggingObject=(Integer val)-> {
            if(val>10){
                System.out.println("Logging");
            }
        };
        loggingObject.accept(11);
    }
}
