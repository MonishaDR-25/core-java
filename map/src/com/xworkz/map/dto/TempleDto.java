package com.xworkz.map.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Data
public class TempleDto {

    private String name;
    private String location;
    private int builtYear;
    private boolean hasGopuram;
}
