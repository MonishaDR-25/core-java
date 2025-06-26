package com.xworkz.collection.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TreeDto implements Serializable {

    private String treeName;
    private String color;
    private int size;
}
