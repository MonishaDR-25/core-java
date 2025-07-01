package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ArrayListToHashSet {
    public static void main(String[] args) {
        Collection<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");

        Set<String> flowerSet = new HashSet<>(flowers);
        System.out.println(flowerSet);

    }
}
