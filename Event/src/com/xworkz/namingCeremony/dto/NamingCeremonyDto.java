package com.xworkz.namingCeremony.dto;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NamingCeremonyDto {

    private String childName;
    private String location;
    private int numberOfGuests;
    private boolean decorated;
    private LocalDate ceremonyDate;
}
