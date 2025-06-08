package com.xworkz.exceptions;

public class SlopeCalculator {
    public static void main(String[] args) {
        int x1 = 5, y1 = 10, x2 = 5, y2 = 20;
        try {
            int slope = (y2 - y1) / (x2 - x1);
            System.out.println("Slope: " + slope);
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate slope (division by zero): " + e.getMessage());
        }
    }
}
