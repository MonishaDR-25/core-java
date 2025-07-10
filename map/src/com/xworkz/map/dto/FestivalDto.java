package com.xworkz.map.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class FestivalDto {
    private String name;
    private String country;
    private String month;

    @Override
    public int hashCode() {
        return Objects.hash(name,country);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof FestivalDto){
                FestivalDto casted=(FestivalDto) obj;
                return this.name.equals(casted.name) && this.country.equals(casted.country);
            }
        }
        return false;
    }
}
