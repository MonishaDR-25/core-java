package com.xworkz.guest;

import java.util.LinkedList;
import java.util.List;

public class LinkedListContainsHello {
    public static void main(String[] args) {
       List<String> greetings = new LinkedList<>();
        greetings.add("Hi");
        greetings.add("Hello");
        greetings.add("Welcome");

        System.out.println(greetings.contains("Hello"));
    }
}
