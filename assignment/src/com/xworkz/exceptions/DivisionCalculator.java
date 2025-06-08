package com.xworkz.exceptions;

public class DivisionCalculator {
    public static void main(String[] args) {
        int a=10, b=0;


        try{
            int result=a/b;
            System.out.println("the result is" +result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero" +e.getMessage());
        }
    }
}
