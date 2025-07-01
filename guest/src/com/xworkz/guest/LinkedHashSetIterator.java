package com.xworkz.guest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIterator {
    public static void main(String[] args) {
        Set<String> brands = new LinkedHashSet<>();
        brands.add("Nike");
        brands.add("Adidas");
        brands.add("Puma");

        Iterator<String> iterator = brands.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
