package com.xworkz.runner;

import com.xworkz.exceptions.SalaryException;

public class SalaryExceptionRunner {
    public static void main(String[] args) throws SalaryException, ArithmeticException {
        SalaryExceptionRunner.checkSalary();
        SalaryExceptionRunner.simulateArithmetic();
    }

    public static void checkSalary() throws SalaryException {
        double salary = -5000;
        if (salary < 0) {
            throw new SalaryException("Salary must be positive");
        }
    }

    public static void simulateArithmetic() throws ArithmeticException {
        throw new ArithmeticException();

    }

}
