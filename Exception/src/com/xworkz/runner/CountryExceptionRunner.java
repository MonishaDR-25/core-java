package com.xworkz.runner;

import com.xworkz.exceptions.CountryException;

public class CountryExceptionRunner {
    public static void main(String[] args) {
        String country="";
       if(!country.equals("India")) {
           throw new CountryException("Country name should be India");
       }

    }
}
