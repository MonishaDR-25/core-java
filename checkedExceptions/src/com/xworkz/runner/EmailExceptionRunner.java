package com.xworkz.runner;

import com.xworkz.exceptions.EmailException;

public class EmailExceptionRunner {
    public static void main(String[] args) throws EmailException, IllegalArgumentException {
        EmailExceptionRunner.checkEmail();
        EmailExceptionRunner.simulateIllegalArg();
    }

    public static void checkEmail() throws EmailException {
        String email = "userexample.com";
        if (!email.contains("@")) {
            throw new EmailException("Invalid email format");
        }
    }

    public static void simulateIllegalArg() {
        throw new IllegalArgumentException();
    }
}
