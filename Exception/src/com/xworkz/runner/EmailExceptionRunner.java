package com.xworkz.runner;

import com.xworkz.exceptions.EmailException;

public class EmailExceptionRunner {
    public static void main(String[] args) {
        String email="";
        if (!email.contains("@")) {
            throw new EmailException("Email must contain '@' symbol.");
        }
    }
}
