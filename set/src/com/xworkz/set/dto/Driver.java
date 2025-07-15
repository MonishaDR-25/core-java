package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Driver {
    private String name;
    private int age;
    private String licenseNumber;
    private Vehicle vehicle;
}
