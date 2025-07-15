package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class House {
    private String address;
    private int floors;
    private boolean isOwned;
    private Security security;
}
