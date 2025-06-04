package com.xworkz.runner;

import com.xworkz.exceptions.WeightException;

public class WeightExceptionRunner {
    public static void main(String[] args) throws WeightException, ClassCastException {
        WeightExceptionRunner.checkWeight();
        WeightExceptionRunner.simulateCast();
    }

    public static void checkWeight() throws WeightException {
        double weight = -45;
        if (weight < 0) {
            throw new WeightException("Weight must be non-negative");
        }
    }

    public static void simulateCast() throws ClassCastException {
        throw new ClassCastException();
    }

}
