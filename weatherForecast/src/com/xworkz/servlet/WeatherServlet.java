package com.xworkz.servlet;

import com.xworkz.dto.WeatherDto;
import com.xworkz.repository.WeatherRepository;
import com.xworkz.repository.WeatherRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/weather",loadOnStartup = 1)
public class WeatherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String place = req.getParameter("place");
        String weather = req.getParameter("weather");
        String minTemp = req.getParameter("minTemp");
        String maxTemp = req.getParameter("maxTemp");
        String cloudy = req.getParameter("cloudy");
        String raining = req.getParameter("raining");
        String rainInMM = req.getParameter("rainInMM");
        String humidity = req.getParameter("humidity");
        String windSpeed = req.getParameter("windSpeed");
        String sunRise = req.getParameter("sunRise");
        String sunSet = req.getParameter("sunSet");
        String moonRise = req.getParameter("moonRise");
        String moonSet = req.getParameter("moonSet");
        String rainStart = req.getParameter("rainStart");
        String rainEnd = req.getParameter("rainEnd");
        String precipitation = req.getParameter("precipitation");

        WeatherDto weatherDto = new WeatherDto();

        weatherDto.setPlace(place);
        weatherDto.setWeather(weather);
        weatherDto.setMinTemp(Double.parseDouble(minTemp));
        weatherDto.setMaxTemp(Double.parseDouble(maxTemp));
        weatherDto.setCloudy(cloudy);
        weatherDto.setRaining(raining);
        weatherDto.setRainInMM(Double.parseDouble(rainInMM));
        weatherDto.setHumidity(Integer.parseInt(humidity));
        weatherDto.setWindSpeed(Integer.parseInt(windSpeed));
        weatherDto.setSunRise(sunRise);
        weatherDto.setSunSet(sunSet);
        weatherDto.setMoonRise(moonRise);
        weatherDto.setMoonSet(moonSet);
        weatherDto.setRainStart(rainStart);
        weatherDto.setRainEnd(rainEnd);
        weatherDto.setPrecipitation(precipitation);

        WeatherRepository weatherRepository = new WeatherRepositoryImpl();
        String result = weatherRepository.persist(weatherDto);

        resp.setContentType("text/html");
        resp.getWriter().write("<h2>Weather Data Insert Result: " + result + "</h2>");
    }
}
