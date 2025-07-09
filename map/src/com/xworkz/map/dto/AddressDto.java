package com.xworkz.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class AddressDto {
    private int number;
    private String street;
    private String city;
    private long pincode;

}
