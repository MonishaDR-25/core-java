package com.xworkz.excelDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class IceCreamDto {
    private String name;
    private String flavour;
    private Integer quantity;
    private String takeAway;
    private String addOns;
    private String coupon;
}
