package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class President {
    private String name;
    private int age;
    private String party;
    private Driver driver;
}
