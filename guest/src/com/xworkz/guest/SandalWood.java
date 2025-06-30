package com.xworkz.guest;

import java.util.Set;
import java.util.TreeSet;

public class SandalWood {
    public static void main(String[] args) {
        TreeSet<String> guestSet = new TreeSet<>();

        guestSet.add("Monisha");
        guestSet.add("Lavanya");
        guestSet.add("Joseph");
        guestSet.add("Romeo");
        guestSet.add("Juliet");

        // 1. Print full sorted guest list
        System.out.println("Guest List (Sorted): " + guestSet);

        // 2. TreeSet-specific: Get first and last guests in sorted order
        String firstGuest = guestSet.first();
        String lastGuest = guestSet.last();
        System.out.println("First Guest: " + firstGuest);
        System.out.println("Last Guest: " + lastGuest);

        // 3. TreeSet-specific: Guests before "Monisha"
        System.out.println("Guests before Monisha: " + guestSet.headSet("Monisha"));

        // 4. TreeSet-specific: Guests from "Lavanya" (inclusive)
        System.out.println("Guests from Lavanya onward: " + guestSet.tailSet("Lavanya"));

        // 5. Check if "Romeo" is in the guest list
        boolean hasRomeo = guestSet.contains("Romeo");
        System.out.println("Is Romeo invited? " + hasRomeo);

        // 6. Remove "Joseph" and show updated list
        guestSet.remove("Joseph");
        System.out.println("Updated Guest List: " + guestSet);
    }
}