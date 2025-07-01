package com.xworkz.guest;

import java.util.Set;
import java.util.TreeSet;

public class MinMax {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(30);
        numbers.add(10);
        numbers.add(70);
        numbers.add(1);

        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
    }
}
