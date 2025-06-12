package com.xworkz.repository;

import com.xworkz.dto.WeatherDto;

public interface WeatherRepository {
    String persist(WeatherDto weatherDto);
}
