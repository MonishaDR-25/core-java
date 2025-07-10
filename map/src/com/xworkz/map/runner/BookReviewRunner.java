package com.xworkz.map.runner;

import com.xworkz.map.dto.BookDto;
import com.xworkz.map.dto.BrandDto;
import com.xworkz.map.dto.ComputerDto;
import com.xworkz.map.dto.ReviewDto;


import java.util.*;

import static java.util.Arrays.asList;


public class BookReviewRunner {
    public static void main(String[] args) {

        BookDto bookDto1 = new BookDto("Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography", 180);
        BookDto bookDto2 = new BookDto("The Alchemist", "Paulo Coelho", "Fiction", 208);
        BookDto bookDto3 = new BookDto("1984", "George Orwell", "Dystopian", 328);
        BookDto bookDto4 = new BookDto("Sapiens", "Yuval Noah Harari", "History", 498);
        BookDto bookDto5 = new BookDto("Clean Code", "Robert C. Martin", "Programming", 464);
        BookDto bookDto6 = new BookDto("Ikigai", "Hector Garcia", "Philosophy", 190);
        BookDto bookDto7 = new BookDto("Atomic Habits", "James Clear", "Self-help", 320);
        BookDto bookDto8 = new BookDto("Deep Work", "Cal Newport", "Productivity", 296);
        BookDto bookDto9 = new BookDto("The Power of Now", "Eckhart Tolle", "Spirituality", 236);
        BookDto bookDto10 = new BookDto("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 207);
        BookDto bookDto11 = new BookDto("The 5AM Club", "Robin Sharma", "Motivational", 336);
        BookDto bookDto12 = new BookDto("Start With Why", "Simon Sinek", "Leadership", 256);
        BookDto bookDto13 = new BookDto("Grit", "Angela Duckworth", "Psychology", 352);
        BookDto bookDto14 = new BookDto("Thinking Fast and Slow", "Daniel Kahneman", "Cognitive Science", 499);
        BookDto bookDto15 = new BookDto("The Psychology of Money", "Morgan Housel", "Finance", 252);
        BookDto bookDto16 = new BookDto("The Monk Who Sold His Ferrari", "Robin Sharma", "Fiction", 198);
        BookDto bookDto17 = new BookDto("Man’s Search for Meaning", "Viktor Frankl", "Memoir", 184);
        BookDto bookDto18 = new BookDto("Can't Hurt Me", "David Goggins", "Biography", 364);
        BookDto bookDto19 = new BookDto("Becoming", "Michelle Obama", "Autobiography", 448);
        BookDto bookDto20 = new BookDto("Educated", "Tara Westover", "Memoir", 334);
        BookDto bookDto21 = new BookDto("Steve Jobs", "Walter Isaacson", "Biography", 656);
        BookDto bookDto22 = new BookDto("Born a Crime", "Trevor Noah", "Autobiography", 304);
        BookDto bookDto23 = new BookDto("The Subtle Art of Not Giving a F*ck", "Mark Manson", "Self-help", 224);
        BookDto bookDto24 = new BookDto("Outliers", "Malcolm Gladwell", "Success", 336);
        BookDto bookDto25 = new BookDto("Daring Greatly", "Brené Brown", "Vulnerability", 320);


        ReviewDto r1 = new ReviewDto("Anil", 5, "Inspiring");
        ReviewDto r2 = new ReviewDto("Ravi", 4, "Motivating");
        ReviewDto r3 = new ReviewDto("Sneha", 5, "Symbolic");
        ReviewDto r4 = new ReviewDto("Divya", 4, "Nice Flow");
        ReviewDto r5 = new ReviewDto("Arun", 5, "Mind-blowing");
        ReviewDto r6 = new ReviewDto("Kiran", 4, "Very informative");
        ReviewDto r7 = new ReviewDto("Dev", 5, "Clean and structured");
        ReviewDto r8 = new ReviewDto("Kavi", 4, "Peaceful concepts");
        ReviewDto r9 = new ReviewDto("Radha", 5, "Very useful");
        ReviewDto r10 = new ReviewDto("Surya", 4, "Work hacks");
        ReviewDto r11 = new ReviewDto("Hari", 5, "Deep spiritual insights");
        ReviewDto r12 = new ReviewDto("Vikram", 3, "Basic finance tips");
        ReviewDto r13 = new ReviewDto("Priya", 5, "Early riser");
        ReviewDto r14 = new ReviewDto("John", 4, "Purpose driven");
        ReviewDto r15 = new ReviewDto("Rekha", 5, "Power of passion");
        ReviewDto r16 = new ReviewDto("Naveen", 5, "Eye-opening research");
        ReviewDto r17 = new ReviewDto("Sita", 4, "Simple language");
        ReviewDto r18 = new ReviewDto("Ganesh", 4, "Thought provoking");
        ReviewDto r19 = new ReviewDto("Rakesh", 5, "Life changing");
        ReviewDto r20 = new ReviewDto("Anu", 5, "Motivating journey");
        ReviewDto r21 = new ReviewDto("Lakshmi", 5, "Strong woman");
        ReviewDto r22 = new ReviewDto("Ajay", 4, "Struggles and strength");
        ReviewDto r23 = new ReviewDto("Suresh", 5, "Genius life");
        ReviewDto r24 = new ReviewDto("Nisha", 5, "Funny and moving");
        ReviewDto r25 = new ReviewDto("Dinesh", 3, "Bold content");

        Map<BookDto, List<ReviewDto>> map = new HashMap<>();
        map.put(bookDto1, Arrays.asList(r1, r2));
        map.put(bookDto2, Arrays.asList(r3, r4));
        map.put(bookDto3, Arrays.asList(r5));
        map.put(bookDto4, Arrays.asList(r6));
        map.put(bookDto5, Arrays.asList(r7));
        map.put(bookDto6, Arrays.asList(r8));
        map.put(bookDto7, Arrays.asList(r9));
        map.put(bookDto8, Arrays.asList(r10));
        map.put(bookDto9, Arrays.asList(r11));
        map.put(bookDto10, Arrays.asList(r12));
        map.put(bookDto11, Arrays.asList(r13));
        map.put(bookDto12, Arrays.asList(r14));
        map.put(bookDto13, Arrays.asList(r15));
        map.put(bookDto14, Arrays.asList(r16));
        map.put(bookDto15, Arrays.asList(r17));
        map.put(bookDto16, Arrays.asList(r18));
        map.put(bookDto17, Arrays.asList(r19));
        map.put(bookDto18, Arrays.asList(r20));
        map.put(bookDto19, Arrays.asList(r21));
        map.put(bookDto20, Arrays.asList(r22));
        map.put(bookDto21, Arrays.asList(r23));
        map.put(bookDto22, Arrays.asList(r24));
        map.put(bookDto23, Arrays.asList(r25));
        map.put(bookDto24, Arrays.asList(r4));
        map.put(bookDto25, Arrays.asList(r15));

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);

        map.forEach((book, reviews) -> {
            System.out.println("Book: " + book);
            reviews.forEach(System.out::println);
        });

        System.out.println("Both Keys and values");
        Set<Map.Entry<BookDto, List<ReviewDto>>> set=map.entrySet();
        set.forEach(e->{
            System.out.println("Key:"+e.getKey()+",value:"+e.getValue());

        });

//        System.out.println("=========OR==========");
//        Set<Map.Entry<BookDto, List<ReviewDto>>> entrySet=map.entrySet();
//        entrySet.forEach(entry->{
//            BookDto bookDto=entry.getKey();
//            ReviewDto reviewDto= (ReviewDto) entry.getValue();
//            System.out.println("BookDto:"+bookDto+",ReviewDto:"+reviewDto);
//        });

        System.out.println("=========OR==========");
        map.entrySet().forEach(System.out::println);
    }
}
