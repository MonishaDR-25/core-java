package com.xworkz.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@ToString
@AllArgsConstructor
public class VendorDto {
    private  String name;
    private String gstNo;
    private LocalDate establishedDate;

}
