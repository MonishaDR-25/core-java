package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Collection;

public class ClearArrayList {
    public static void main(String[] args) {
        Collection<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");

        animals.clear();
        System.out.println(animals);
    }
}
