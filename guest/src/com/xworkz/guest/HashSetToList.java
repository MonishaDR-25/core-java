package com.xworkz.guest;

import java.util.*;

public class HashSetToList {
    public static void main(String[] args) {
       Set<String> brands = new HashSet<>();
        brands.add("LG");
        brands.add("Sony");
        brands.add("Samsung");

        Collection<String> brandList = new ArrayList<>(brands);
        System.out.println(brandList);
    }
}
