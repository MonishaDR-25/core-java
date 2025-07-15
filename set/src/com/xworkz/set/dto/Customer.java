package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Customer {
    private String name;
    private String email;
    private int age;
    private Passport passport;
}
