package com.xworkz.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class RestaurantDto {
    private String name;
    private String location;
    private long contactDetails;
    private String email;
    private double ratings;
    private String[] foodMenu;
    private String type;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bookedDate;
    private LocalTime bookedTime;
}
