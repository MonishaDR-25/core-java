package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Detail {
    private String detailId;
    private String description;
    private String documentType;
    private Education education;
}
