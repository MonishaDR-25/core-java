package com.xworkz.repository;

import com.xworkz.dto.WeatherDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WeatherRepositoryImpl implements WeatherRepository{
    public WeatherRepositoryImpl() {
        System.out.println("Running WeatherRepositoryImpl");
    }

    @Override
    public String persist(WeatherDto weatherDto) {
        System.out.println("Running persist in WeatherRepositoryImpl");
        System.out.println("Should save into DB...");

        if (weatherDto != null) {
            String url = "jdbc:mysql://localhost:3306/xworkz";
            String username = "root";
            String password = "moni@12345";

            try {
                // Step 1: Load the driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Step 2: Create the connection
                Connection connection= DriverManager.getConnection(url,username,password);

                // Step 3: Prepare the SQL query
                String sql = "INSERT INTO weather " +
                        "VALUES (0, '" + weatherDto.getPlace() + "', '" + weatherDto.getWeather() + "', " +
                        weatherDto.getMinTemp() + ", " + weatherDto.getMaxTemp() + ", '" +
                        weatherDto.getCloudy() + "', '" + weatherDto.getRaining() + "', " +
                        weatherDto.getRainInMM() + ", " + weatherDto.getHumidity() + ", " +
                        weatherDto.getWindSpeed() + ", '" + weatherDto.getSunRise() + "', '" +
                        weatherDto.getSunSet() + "', '" + weatherDto.getMoonRise() + "', '" +
                        weatherDto.getMoonSet() + "', '" + weatherDto.getRainStart() + "', '" +
                        weatherDto.getRainEnd() + "', '" + weatherDto.getPrecipitation() + "', now())";

                // Step 4: Execute the statement
                Statement statement=connection.createStatement();
                statement.executeUpdate(sql);

            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return "success";
        }

        return "failure";
    }
}
