package com.xworkz.repository;

import com.xworkz.dto.ProductDto;

public interface ProductRepository {
    boolean persist(ProductDto productDto);
}
