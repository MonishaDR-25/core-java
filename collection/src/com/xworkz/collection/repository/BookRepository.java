package com.xworkz.collection.repository;

import com.xworkz.collection.dto.BookDto;

import java.util.Collection;

public interface BookRepository {
    Collection<BookDto> findAll();
}
