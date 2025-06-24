package com.xworkz.collection.runner;

import com.xworkz.collection.dto.BookDto;

import java.util.ArrayList;
import java.util.Collection;

public class BookRunner {
    public static void main(String[] args) {

        BookDto bookDto1 = new BookDto("The Alchemist", "Paulo Coelho", "Fiction", 208, 350);
        BookDto bookDto2 = new BookDto("Sapiens", "Yuval Harari", "History", 464, 500);
        BookDto bookDto3= new BookDto("Atomic Habits", "James Clear", "Self-help", 320, 400);
        BookDto bookDto4= new BookDto("Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography", 180, 250);
        BookDto bookDto5= new BookDto("1984", "George Orwell", "Dystopian", 328, 300);
        BookDto bookDto6= new BookDto("Ikigai", "Francesc Miralles", "Philosophy", 200, 350);
        BookDto bookDto7= new BookDto("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 336, 450);
        BookDto bookDto8= new BookDto("Power of Now", "Eckhart Tolle", "Spiritual", 224, 370);
        BookDto bookDto9= new BookDto("To Kill a Mockingbird", "Harper Lee", "Classic", 281, 280);
        BookDto bookDto10= new BookDto("The Monk Who Sold His Ferrari", "Robin Sharma", "Motivation", 224, 300);

        Collection<BookDto> books = new ArrayList<>();
        books.add(bookDto1);
        books.add(bookDto2);
        books.add(bookDto3);
        books.add(bookDto4);
        books.add(bookDto5);
        books.add(bookDto6);
        books.add(bookDto7);
        books.add(bookDto8);
        books.add(bookDto9);
        books.add(bookDto10);

        for (BookDto bookDto : books) {
            System.out.println(bookDto.getTitle() + "," + bookDto.getAuthor() + "," + bookDto.getGenre() + "," + bookDto.getPages() + "," + bookDto.getPrice());
        }
    }
}
