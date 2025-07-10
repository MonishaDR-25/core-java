package com.xworkz.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class BookDto {
    private String title;
    private String author;
    private String genre;
    private int pages;

    @Override
    public int hashCode() {
        return Objects.hash(title,author);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof BookDto){
                BookDto casted=(BookDto) obj;
                return this.title.equals(casted.title) &&this.author.equals(casted.author);

            }
        }
        return false;
    }
}
