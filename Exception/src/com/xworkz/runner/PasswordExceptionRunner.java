package com.xworkz.runner;

import com.xworkz.exceptions.PasswordException;

public class PasswordExceptionRunner {
    public static void main(String[] args) {
        String password="";
        if(password.length()<8 || password.length()>16){
            throw new PasswordException("The password length should be greater than 8 and less than 16");
        }
    }
}
