package com.xworkz.repository;

import com.xworkz.constant.DBProperties;
import com.xworkz.dto.SoapDto;

import java.sql.*;
import java.time.LocalDate;
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
                Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(),DBProperties.USER_NAME.getProp(),DBProperties.SECRET.getProp());

                // Step 3: Create SQL query
                String sql = "INSERT INTO soap (id, name, brand, price, manufactureDate, fragrant, color) " +
                        "VALUES (0, '" + soapDto.getName() + "', '" + soapDto.getBrand() + "', " +
                        soapDto.getPrice() + ", '" + soapDto.getManufactureDate() + "', " +
                        soapDto.isFragrant() + ", '" + soapDto.getColor() + "')";



                // Step 4: Execute the query
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);



            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return "success";
        }

        return "failure";
    }

    @Override
    public Optional<SoapDto> findById(int id) {
        System.out.println("running findById in SoapRepositoryImpl");

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(DBProperties.URL.getProp(),DBProperties.USER_NAME.getProp(),DBProperties.SECRET.getProp());
            String findByIdSQL= "select * from soap soa where soa.id="+id+"";
            System.out.println("findById:"+findByIdSQL);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(findByIdSQL);
            System.out.println("resultSet:"+resultSet);
            while(resultSet.next())
            {
                int pk=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String brand=resultSet.getString("brand");
                double price=resultSet.getDouble("price");
                LocalDate manufactureDate=resultSet.getDate("manufactureDate").toLocalDate();
                boolean fragrant =resultSet.getBoolean("fragrant");
                String color=resultSet.getString("color");

                SoapDto soapDto=new SoapDto(name, brand, price,manufactureDate, fragrant,color);
                return Optional.of(soapDto);
            }


        }  catch (SQLException | ClassNotFoundException exception)
        {
            System.err.println("SQLException in findById "+exception.getMessage());
        }

        return Optional.empty();
    }
}
