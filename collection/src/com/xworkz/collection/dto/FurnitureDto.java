package com.xworkz.collection.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class FurnitureDto {
    private String type;
    private String material;
    private String color;
    private double price;
    private String brand;

}
