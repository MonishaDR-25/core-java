package com.xworkz.collection.runner;

import com.xworkz.collection.dto.BookDto;
import com.xworkz.collection.repository.BookRepository;
import com.xworkz.collection.repository.BookRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BookRunner {
    public static void main(String[] args) {

        BookRepository repository = new BookRepositoryImpl();
        Collection<BookDto> books = repository.findAll();

        System.out.println("------Using for each------");
        for (BookDto book : books) {
            System.out.println(book.getTitle() + "," +
                    book.getAuthor() + "," +
                    book.getGenre() + "," +
                    book.getPages() + " pages," +
                    book.getPrice());
        }

        System.out.println("------Using Iterator------");
        Iterator<BookDto> iterator = books.iterator();
        while (iterator.hasNext()) {
            BookDto book = iterator.next();
            System.out.println(book.getGenre() + "," +
                    book.getPages() + " pages," +
                    book.getAuthor() + "," +
                    book.getPrice() + "," +
                    book.getTitle());
        }

        System.out.println("------Books with price > 300------");
        for (BookDto book : books) {
            if (book.getPrice() > 300) {
                System.out.println(book.getTitle() + " costs " + book.getPrice());
            }
        }
    }
}
