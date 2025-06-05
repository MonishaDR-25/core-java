package com.xworkz.runner;

import com.xworkz.dto.RestaurantDto;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantDto restaurantDto = new RestaurantDto();
        restaurantDto.setRestaurantName("3Anmol");
        restaurantDto.setRestaurantLocation("Shimoga");
        restaurantDto.setContactDetails(854699138);
        restaurantDto.setEmail("anmol@gmail.com");
        restaurantDto.setrating(4);
        restaurantDto.setFoodMenu(new String[]{"Biriyani, Starters, Beverges, Deserts"});
        restaurantDto.setType(false);
        restaurantDto.setOpeningTime(LocalTime.of(9,0));
        restaurantDto.setClosingTime(LocalTime.of(12,0));
        restaurantDto.setBookedDate(LocalDate.now());
        restaurantDto.setBookedTime(LocalTime.of(10,0));
    }
}
