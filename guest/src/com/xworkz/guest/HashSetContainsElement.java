package com.xworkz.guest;

import java.util.HashSet;
import java.util.Set;

public class HashSetContainsElement {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");

        System.out.println(fruits.contains("Banana"));
    }
}
