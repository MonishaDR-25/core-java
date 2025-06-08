package com.xworkz.exceptions;

public class TemperatureConverter {
    public static void main(String[] args) {
        String tempInput="thirty";
        try {
            double temp = Double.parseDouble(tempInput);
            System.out.println("Temperature: " + temp);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature input: " + e.getMessage());
        }
    }
}
