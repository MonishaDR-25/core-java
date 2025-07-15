package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Education {
    private String qualification;
    private String institution;
    private int passingYear;
    private double percentage;
}
