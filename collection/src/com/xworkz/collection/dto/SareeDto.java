package com.xworkz.collection.dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class SareeDto {
    private String type;
    private String color;
    private String material;
    private double cost;
}
