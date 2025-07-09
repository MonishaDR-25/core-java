package com.xworkz.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class SareeDto {
    private String brand;
    private String color;
    private double price;

    @Override
    public int hashCode() {
        return Objects.hash(brand,color);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof SareeDto){
                SareeDto casted=(SareeDto) obj;
                return this.brand.equals(casted.brand) && this.color.equals(casted.color);
            }
        }
        return false;
    }
}
