package com.xworkz.runner;

import com.xworkz.exceptions.MobileNumberException;

public class MobileNumberExceptionRunner {
    public static void main(String[] args) {
        String mobileNumber="";
        if (mobileNumber.length() < 10 || mobileNumber.length() < 10) {
            throw new MobileNumberException("Mobile number must be exactly 10 digits.");
        }

    }
}
