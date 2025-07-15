package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Job {
    private String role;
    private String department;
    private double salary;
    private Detail detail;
}
