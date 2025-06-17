package com.xworkz.repository;

import com.xworkz.dto.SoapDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class SoapRepositoryImpl implements SoapRepository {

    public SoapRepositoryImpl() {
        System.out.println("Running SoapRepositoryImpl");
    }

    @Override
    public String persist(SoapDto soapDto) {
        System.out.println("Running persist in SoapRepositoryImpl");
        System.out.println("Should save into DB...");

        if (soapDto != null) {
            String url = "jdbc:mysql://localhost:3306/xworkz";
            String username = "root";
            String password = "moni@12345";

            try {
                // Step 1: Load the driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Step 2: Establish connection
                Connection connection = DriverManager.getConnection(url, username, password);

                // Step 3: Create SQL query
                String sql = "INSERT INTO soap (id, name, brand, price, manufactureDate, fragrant, color) " +
                        "VALUES (0, '" + soapDto.getName() + "', '" + soapDto.getBrand() + "', " +
                        soapDto.getPrice() + ", '" + soapDto.getManufactureDate() + "', " +
                        soapDto.isFragrant() + ", '" + soapDto.getColor() + "')";



                // Step 4: Execute the query
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);

                return "success";

            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return "failure";
    }

    @Override
    public Optional<SoapDto> findById(int id) {
        System.out.println("running findById in SoapRepositoryImpl");

        return SoapRepository.super.findById(id);
    }
}
