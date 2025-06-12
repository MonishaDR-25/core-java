package com.xworkz.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto {
    private String place;
    private String weather;
    private double minTemp;
    private double maxTemp;
    private String cloudy;
    private String raining;
    private double rainInMM;
    private int humidity;
    private int windSpeed;
    private String sunRise;
    private String sunSet;
    private String moonRise;
    private String moonSet;
    private String rainStart;
    private String rainEnd;
    private String precipitation;
    private LocalDateTime createdDateTime;

}
