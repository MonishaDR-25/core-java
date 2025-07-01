package com.xworkz.guest;

import java.util.TreeSet;

public class Countries{
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Brazil");
        countries.add("Japan");
        countries.add("Germany");

        System.out.println(countries);
    }
}
