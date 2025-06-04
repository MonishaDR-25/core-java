package com.xworkz.runner;

import com.xworkz.exceptions.PasswordException;
import com.xworkz.exceptions.SalaryException;

public class PasswordExceptionRunner {
    public static void main(String[] args) throws PasswordException,NullPointerException {
        PasswordExceptionRunner.checkPassword();
        PasswordExceptionRunner.simulateNull();

    }
    public static void checkPassword() throws PasswordException{
        String Password="";
        if(Password.length()<6){
            throw new PasswordException("Length of password cannot be less than 6");
        }
    }

    public static void simulateNull() throws NullPointerException{
        throw new NullPointerException();
    }
}
