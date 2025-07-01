package com.xworkz.guest;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintNumbers {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<Integer>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(10);
        set.add(20);
        System.out.println("Numbers are"+set);

    }
}
