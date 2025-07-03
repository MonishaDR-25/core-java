package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class ProductDto implements Comparable<ProductDto> {
    private int id;
    private  String name;
    private String type;
    private LocalDate manufactureDate;
    private String manufacturer;
    private double costPerItem;
    private double discount;
    private int quantity;
    private int warranty;

    @Override
    public int compareTo(ProductDto o) {
        System.out.println("Running compareTo...");
        ProductDto leftSide=this;
        ProductDto rightSide=o;
        return Integer.compare(leftSide.id,rightSide.id);
    }
}
