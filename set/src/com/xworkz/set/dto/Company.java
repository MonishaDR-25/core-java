package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Company {
    private String name;
    private String industry;
    private int employees;
    private CEO ceo;
}
