package com.xworkz.map.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class PersonDto {
    private String name;
    private String email;
    private String aadhar;

    @Override
    public int hashCode() {
        return Objects.hash(name,email);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof PersonDto){
                PersonDto casted=(PersonDto) obj;
                return this.email.equals(casted.email) && this.name.equals(casted.name);
            }
        }
        return false;
    }
}
