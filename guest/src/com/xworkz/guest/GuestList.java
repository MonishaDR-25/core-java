package com.xworkz.guest;

import java.util.LinkedHashSet;
import java.util.Set;

import java.util.LinkedHashSet;

public class GuestList {
    public static void main(String[] args) {
        LinkedHashSet<String> guestSet = new LinkedHashSet<>();

        guestSet.add("Monisha");
        guestSet.add("Lavanya");
        guestSet.add("Joseph");
        guestSet.add("Romeo");
        guestSet.add("Juliet");

        // 1. add
        System.out.println("Guest List: " + guestSet);

        // 2. Check if "Juliet" is in the set
        boolean hasJuliet = guestSet.contains("Juliet");
        System.out.println("Is Juliet invited? " + hasJuliet);

        // 3. Remove "Romeo" and print the updated list
        guestSet.remove("Romeo");
        System.out.println("Guest List after removing Romeo: " + guestSet);

        // 4. Check if the guest list is empty
        boolean isEmpty = guestSet.isEmpty();
        System.out.println("Is the guest list empty? " + isEmpty);

        // 5. Get the number of guests
        int count = guestSet.size();
        System.out.println("Number of guests invited: " + count);
    }
}
