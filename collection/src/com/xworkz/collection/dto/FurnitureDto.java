package com.xworkz.collection.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode

public class FurnitureDto {
    private String type;
    private String material;
    private String color;
    private double price;
    private String brand;

}
