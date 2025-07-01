package com.xworkz.guest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FruitNames {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Papaya");
        set.add("Apple");
        System.out.println("Fruit names are"+set);
    }
}
