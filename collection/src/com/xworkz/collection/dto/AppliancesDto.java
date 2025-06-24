package com.xworkz.collection.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AppliancesDto {

    private String name;
    private String brand;
    private double power;
    private String type;
    private double price;

}
