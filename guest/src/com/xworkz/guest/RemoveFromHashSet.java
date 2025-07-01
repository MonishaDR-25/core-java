package com.xworkz.guest;

import java.util.HashSet;
import java.util.Set;

public class RemoveFromHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);

        set.remove(6);
        System.out.println(set);
    }
}
