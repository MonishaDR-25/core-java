package com.xworkz.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class ComputerDto {
    private String name;
    private String type;
    private double price;
    private String processor;

    @Override
    public int hashCode() {
        return Objects.hash(name,type);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof ComputerDto){
                ComputerDto casted=(ComputerDto) obj;
                return this.name.equals(casted.name)&& this.type.equals(casted.type);
            }
        }
        return false;
    }
}
