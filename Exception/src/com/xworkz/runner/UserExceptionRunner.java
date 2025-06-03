package com.xworkz.runner;

import com.xworkz.exceptions.UserException;

public class UserExceptionRunner {
    public static void main(String[] args) {
        String username="";
        if (Character.isDigit(username.charAt(0))) {
            throw new UserException("Username must not start with a number.");
        }

    }
}
