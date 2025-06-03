package com.xworkz.runner;

import com.xworkz.exceptions.UserNameException;

public class UserNameExceptionRunner {
    public static void main(String[] args) {
        String username="";
        if (username.length() < 3) {
            throw new UserNameException("Username must be at least 3 characters");
        }
    }
}
