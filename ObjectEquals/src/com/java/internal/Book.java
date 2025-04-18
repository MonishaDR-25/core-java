package com.java.internal;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Book) {
            Book book = (Book) obj;
            if (Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author)) {
                System.out.println("Book is matching..");
                return true;
            }
        }
        return false;
    }
}
