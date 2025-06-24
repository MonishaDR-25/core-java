package com.xworkz.collection.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class CampingAccessoriesDto {
    private String name;
    private String brand;
    private String material;
    private double weight;
    private double price;
}
