package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Passport {
    private String passportNumber;
    private String issueDate;
    private String expiryDate;
    private Country country;
}
