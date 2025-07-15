package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Country {
    private String name;
    private String continent;
    private int population;
    private President president;
}
