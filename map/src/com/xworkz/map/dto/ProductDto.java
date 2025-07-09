package com.xworkz.map.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class ProductDto {
    private String name;
    private String type;
    private double price;
    private int modelNo;
    private int id;

    @Override
    public int hashCode() {
        return Objects.hash(name,price);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof ProductDto){
                ProductDto casted=(ProductDto) obj;
                return this.name.equals(casted.name) && this.price == casted.price;
            }
        }
        return false;
    }
}
