package com.xworkz.collection.repository;

import com.xworkz.collection.dto.BookDto;

import java.util.ArrayList;
import java.util.Collection;

public class BookRepositoryImpl implements BookRepository{
    @Override
    public Collection<BookDto> findAll() {
        BookDto b1 = new BookDto("Ramayana", "Valmiki", "Epic", 500, 450);
        BookDto b2 = new BookDto("Wings of Fire", "A.P.J Abdul Kalam", "Biography", 180, 250);
        BookDto b3 = new BookDto("The Alchemist", "Paulo Coelho", "Fiction", 210, 300);
        BookDto b4 = new BookDto("1984", "George Orwell", "Dystopian", 350, 550);
        BookDto b5 = new BookDto("Sapiens", "Yuval Noah Harari", "History", 400, 600);

        Collection<BookDto> collection = new ArrayList<>();
        collection.add(b1);
        collection.add(b2);
        collection.add(b3);
        collection.add(b4);
        collection.add(b5);

        return collection;
    }
}
