package com.xworkz.runner;

import com.xworkz.exceptions.AddressException;

public class AdderssExceptionRunner {
    public static void main(String[] args) {
        String address="";
        if (address==null){
            throw new AddressException("The given address should not be null");
        }
    }
}
