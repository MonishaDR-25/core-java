package com.xworkz.service;

import com.xworkz.dto.RestaurantDto;
import com.xworkz.exception.*;

import javax.naming.InvalidNameException;

public interface RestaurantService {
    void ValidateAndSave(RestaurantDto restaurantDto) throws InvalidNameException, RatingException, FoodMenuException, OpeningTimeException, ClosingTimeException, BookedDateException, BookedTimeException;
}
