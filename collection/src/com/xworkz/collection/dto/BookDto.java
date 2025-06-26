package com.xworkz.collection.dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class BookDto {

    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;

}
