package com.xworkz.service;

import com.xworkz.dto.RestaurantDto;
import com.xworkz.exception.*;

import javax.naming.InvalidNameException;

public class RestaurantServiceImpl implements RestaurantService{
    @Override
    public void validate(RestaurantDto restaurantDto) throws InvalidNameException, InvalidRatingException, FoodMenuException, OpeningTimeException, ClosingTimeException, BookedDateException, BookedTimeException {
        if (restaurantDto == null) {
            throw new NullPointerException("RestaurantDto is null");
        }
        String name = restaurantDto.getRestaurantName();
        if (name == null || name.isEmpty()) {
            throw new InvalidNameException("Name must not be null");
        }
        if (restaurantDto.getRestaurantName().length() < 3) {
            throw new InvalidNameException("Name must be at least 3 characters");
        }
        if (restaurantDto.getRestaurantName().length() > 25) {
            throw new InvalidNameException("Name must not exceed 25 characters");
        }
        if (Character.isDigit(restaurantDto.getRestaurantName().charAt(0))) {
            throw new InvalidNameException("Name must not starts with number");
        }
        if (restaurantDto.getRating() < 3) {
            throw new InvalidRatingException("Rating must be at greater than 3");
        }
        if (restaurantDto.getFoodMenu() == null) {
            throw new FoodMenuException("Food menu must not be null");
        }
        if (restaurantDto.getFoodMenu().length == 0) {
            throw new ArrayIndexOutOfBoundsException("Food menu is Empty");
        }
        if (restaurantDto.getOpeningTime().isBefore(LocalTime.of(9, 0))) {
            throw new OpeningTimeException("Opening Time must be After 9 AM");
        }
        if (restaurantDto.getClosingTime().isAfter(LocalTime.of(12, 0))) {
            throw new ClosingTimeException("Closing Time must be After 12 PM");
        }
        if (restaurantDto.getBookedDate().isBefore(LocalDate.now())) {
            throw new BookedDateException("Booking date can not be in the past");
        }
        if (restaurantDto.getBookedTime().isBefore(LocalTime.of(9, 0)) || restaurantDto.getBookedTime().isAfter(LocalTime.of(12, 0))) {
            throw new BookedTimeException("Booking Time must be between the 9 AM to 12 PM");
        }
    }
}