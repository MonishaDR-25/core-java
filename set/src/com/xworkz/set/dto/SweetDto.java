package com.xworkz.set.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;


@Getter
@AllArgsConstructor
@ToString
public class SweetDto {
   private String name;
    private double price;
    private String[] ingredients;
    private int quantity;
    private String pack;

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.ingredients);
        }


    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof SweetDto){
                SweetDto casted=(SweetDto) obj;
                return Arrays.equals(this.ingredients, casted.ingredients);
            }
        }
        return false;
    }
}
