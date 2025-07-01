package com.xworkz.guest;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetRemoveLessThan {
    public static void main(String[] args) {
        Set<Integer> values = new TreeSet<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(50);
        values.add(60);
        values.add(70);

        values.removeIf(n -> n < 50);
        System.out.println(values);
    }
}
