package com.xworkz.guest;

import java.util.LinkedList;

public class ReplaceLinkedListElement {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        books.add("One");
        books.add("Two");
        books.add("Three");

        books.set(1, "UpdatedValue");
        System.out.println(books);
    }
}
