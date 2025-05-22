package com.xworkz.repository;

import com.xworkz.dto.ProductDto;

import javax.sound.midi.Soundbank;

public class ProductRepositoryImpl implements ProductRepository{

    public ProductRepositoryImpl(){
        System.out.println("Running ProductRepositoryImpl");
    }

    @Override
    public boolean persist(ProductDto productDto) {
        return true;
    }
}
