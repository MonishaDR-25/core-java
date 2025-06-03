package com.xworkz.runner;

import com.xworkz.exceptions.AadharNumberException;

public class AadharNumberExceptionRunner {
    public static void main(String[] args) {
        String AadharNumber="";
        if (AadharNumber.length() < 10 || AadharNumber.length() > 10 ) {
            throw new AadharNumberException("Mobile number must be exactly 10 digits.");
        }
    }
}
