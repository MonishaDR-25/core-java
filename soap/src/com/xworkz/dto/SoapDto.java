package com.xworkz.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SoapDto {
    private String name;
    private String brand;
    private double price;
    private LocalDate manufactureDate;
    private boolean fragrant;
    private String color;

}
