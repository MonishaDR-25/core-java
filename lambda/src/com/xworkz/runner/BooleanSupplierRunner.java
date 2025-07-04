package com.xworkz.runner;

import com.xworkz.lambda.BooleanSupplier;

public class BooleanSupplierRunner {
    public static void main(String[] args) {
        BooleanSupplier isSystemReady = () -> {
            int load = 40;
            int threshold = 50;
            return load < threshold;
        };

        System.out.println(isSystemReady.getAsBoolean());
    }
    }

