package com.xworkz.repository;

import com.xworkz.dto.ProductDto;

import java.util.Collection;

public interface ProductRepository {
    Collection<ProductDto> findAll();
}
