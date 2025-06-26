package com.xworkz.collection.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class AppliancesDto {

    private String name;
    private String brand;
    private double power;
    private String type;
    private double price;

}
