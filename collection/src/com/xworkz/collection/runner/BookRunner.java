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

        //contains method
        BookDto checkDto=new BookDto("Ramayana", "Valmiki", "Epic", 500, 450);
        System.out.println("Contains 'Ramayana'" +books.contains(checkDto));

        //isEmpty
        System.out.println("Is Book Data Empty?"+ books.isEmpty());

        //remove
        boolean removed=books.remove(checkDto);
        System.out.println("Removed? 'Ramayana"+removed);
        System.out.println("Contains 'Ramayana' after removal" +books.contains(checkDto));

        //addAll
        Collection<BookDto> additionalBooks=new ArrayList<>();
        additionalBooks.add(new BookDto("Atomic Habits", "James Clear", "Self-help", 320, 399));
        additionalBooks.add(new BookDto("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 250, 299));
        System.out.println("Add all Additional Books"+ books.addAll(additionalBooks));
        System.out.println("After Adding additional books "+books.size());

        //removeAll
        boolean removedAll= books.removeAll(additionalBooks);
        System.out.println("Removed all additional books"+removedAll);

        //containsAll
        boolean containsAllOriginal= books.containsAll(repository.findAll());
        System.out.println("Contains all original Books"+containsAllOriginal);


    }
}
