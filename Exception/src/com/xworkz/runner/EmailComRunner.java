package com.xworkz.runner;

import com.xworkz.exceptions.EmailComException;

public class EmailComRunner {
    public static void main(String[] args) {
        String email="";
        if (!email.endsWith(".com") ){
            throw new EmailComException("Password should end with .com");

        }
    }
}
