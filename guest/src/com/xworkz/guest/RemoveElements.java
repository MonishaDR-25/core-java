package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveElements {
    public static void main(String[] args) {
        Collection<Integer> elements = new ArrayList<Integer>();
        elements.add(50);
        elements.add(70);
        elements.add(48);
        elements.add(60);
        elements.add(80);
        elements.removeIf(n -> n > 50);
        System.out.println("After removal elements are:" + elements);

    }
}
