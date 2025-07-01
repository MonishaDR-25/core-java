package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Python");
        names.add("Java");
        names.add("C++");
        names.add("Ruby");
        names.add("Java Script");
        System.out.println("Contains Java? " + names.contains("Java"));
    }
}
