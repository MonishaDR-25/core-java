package com.xworkz.repository;

import com.xworkz.dto.StampedeCaseDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedeCaseRepositoryImpl implements StampedeCaseRepository{

    public StampedeCaseRepositoryImpl(){
        System.out.println("Running ProductRepositoryImpl");
    }

    @Override
    public String persist(StampedeCaseDto stampedeCaseDto) {
        System.out.println("running persist in StampedeCaseRepositoryImpl");
        System.out.println("should save into DB...");

        if (stampedeCaseDto != null) {
            String url="jdbc:mysql://localhost:3306/xworkz";
            String username="root";
            String password="moni@12345";
            //4 steps
            //Step1 : Load the Driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Step 2 : Create the Connection
                Connection connection= DriverManager.getConnection(url,username,password);
                //Step 3 : Prepare the Statement
                String sql="insert into stampede_case values(0,'"+stampedeCaseDto.getEvent()+"','"+stampedeCaseDto.getLocation()+"',"+stampedeCaseDto.getNoOfDeaths()+","+stampedeCaseDto.getNoOfInjuries()+")";
                Statement statement=connection.createStatement();
                //step 4 : execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return "Success";
        }
        return "failed";
    }
    }

