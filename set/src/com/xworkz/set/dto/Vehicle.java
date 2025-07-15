package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Vehicle {
    private String model;
    private String brand;
    private String number;
    private Company company;
}
