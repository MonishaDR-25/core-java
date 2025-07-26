package com.xworkz.task.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class NameDto {
    private String firstName;
    private String middleName;
    private String lastName;
}
