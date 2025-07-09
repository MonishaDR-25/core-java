package com.xworkz.map.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class BrandDto {
    private String name;
    private String country;
    private int foundedYear;
    private String founder;
}
