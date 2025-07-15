package com.xworkz.set.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Security {
    private String securityId;
    private String type;
    private boolean isActive;
    private Job job;
}
