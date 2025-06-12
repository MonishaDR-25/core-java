package com.xworkz.service;

import com.xworkz.dto.WeatherDto;
import com.xworkz.repository.WeatherRepository;
import com.xworkz.repository.WeatherRepositoryImpl;

public class WeatherServiceImpl implements WeatherService{
    @Override
    public String save(WeatherDto weatherDto) {
        System.out.println("Saving WeatherDto in WeatherServiceImpl: " + weatherDto);

        if (weatherDto != null) {
            System.out.println("WeatherDto is not null");

            String place = weatherDto.getPlace();
            if (place != null && place.length() >= 3 && place.length() <= 50) {
                System.out.println("Place name is valid");
            } else {
                System.err.println("Invalid place name");
                return "failure";
            }

            String weather = weatherDto.getWeather();
            if (weather != null && weather.length() >= 3 && weather.length() <= 30) {
                System.out.println("Weather is valid");
            } else {
                System.err.println("Invalid weather");
                return "failure";
            }

            if (weatherDto.getMinTemp() >= -100 && weatherDto.getMinTemp() <= 100) {
                System.out.println("Min Temp is valid");
            } else {
                System.err.println("Invalid Min Temp");
                return "failure";
            }

            if (weatherDto.getMaxTemp() >= -100 && weatherDto.getMaxTemp() <= 100) {
                System.out.println("Max Temp is valid");
            } else {
                System.err.println("Invalid Max Temp");
                return "failure";
            }

            String cloudy = weatherDto.getCloudy();
            if (cloudy != null && cloudy.length() >= 2 && cloudy.length() <= 20) {
                System.out.println("Cloudy field is valid");
            } else {
                System.err.println("Invalid Cloudy value");
                return "failure";
            }

            String raining = weatherDto.getRaining();
            if (raining != null && raining.length() >= 2 && raining.length() <= 20) {
                System.out.println("Raining field is valid");
            } else {
                System.err.println("Invalid Raining value");
                return "failure";
            }

            if (weatherDto.getRainInMM() >= 0 && weatherDto.getRainInMM() <= 1000) {
                System.out.println("Rain in MM is valid");
            } else {
                System.err.println("Invalid Rain in MM");
                return "failure";
            }

            if (weatherDto.getHumidity() >= 0 && weatherDto.getHumidity() <= 100) {
                System.out.println("Humidity is valid");
            } else {
                System.err.println("Invalid Humidity");
                return "failure";
            }

            if (weatherDto.getWindSpeed() >= 0 && weatherDto.getWindSpeed() <= 200) {
                System.out.println("Wind Speed is valid");
            } else {
                System.err.println("Invalid Wind Speed");
                return "failure";
            }

            String sunRise = weatherDto.getSunRise();
            if (sunRise != null && !sunRise.isEmpty()) {
                System.out.println("Sun Rise Time is valid");
            } else {
                System.err.println("Invalid Sun Rise Time");
                return "failure";
            }

            String sunSet = weatherDto.getSunSet();
            if (sunSet != null && !sunSet.isEmpty()) {
                System.out.println("Sun Set Time is valid");
            } else {
                System.err.println("Invalid Sun Set Time");
                return "failure";
            }

            String moonRise = weatherDto.getMoonRise();
            if (moonRise != null && !moonRise.isEmpty()) {
                System.out.println("Moon Rise Time is valid");
            } else {
                System.err.println("Invalid Moon Rise Time");
                return "failure";
            }

            String moonSet = weatherDto.getMoonSet();
            if (moonSet != null && !moonSet.isEmpty()) {
                System.out.println("Moon Set Time is valid");
            } else {
                System.err.println("Invalid Moon Set Time");
                return "failure";
            }

            String rainStart = weatherDto.getRainStart();
            if (rainStart != null && !rainStart.isEmpty()) {
                System.out.println("Rain Start Time is valid");
            } else {
                System.err.println("Invalid Rain Start Time");
                return "failure";
            }

            String rainEnd = weatherDto.getRainEnd();
            if (rainEnd != null && !rainEnd.isEmpty()) {
                System.out.println("Rain End Time is valid");
            } else {
                System.err.println("Invalid Rain End Time");
                return "failure";
            }

            String precipitation = weatherDto.getPrecipitation();
            if (precipitation != null && precipitation.length() >= 3 && precipitation.length() <= 50) {
                System.out.println("Precipitation is valid");
            } else {
                System.err.println("Invalid Precipitation");
                return "failure";
            }

        } else {
            System.err.println("WeatherDto is null");
            return "failure";
        }

        WeatherRepository weatherRepository = new WeatherRepositoryImpl();
        weatherRepository.persist(weatherDto);

        System.out.println("Weather data validated and saved successfully");

        return "success";
    }
}
