package com.xworkz.namingCeremony.repository;

import com.xworkz.namingCeremony.constant.DBProperties;
import com.xworkz.namingCeremony.dto.NamingCeremonyDto;

import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

public class NamingCeremonyRepositoryImpl implements NamingCeremonyRepository {

    @Override
    public boolean persist(NamingCeremonyDto namingCeremonyDto) {
        System.out.println("running save in NamingCeremonyRepositoryImpl");
        if (namingCeremonyDto != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager
                        .getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());

                System.out.println("===============================");

                String preSql = "INSERT INTO naming_ceremony_event VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(preSql);

                preparedStatement.setInt(1, 0); // id is auto-increment in DB
                preparedStatement.setString(2, namingCeremonyDto.getChildName());
                preparedStatement.setString(3, namingCeremonyDto.getLocation());
                preparedStatement.setInt(4, namingCeremonyDto.getNumberOfGuests());
                preparedStatement.setBoolean(5, namingCeremonyDto.isDecorated());
                preparedStatement.setDate(6, Date.valueOf(namingCeremonyDto.getCeremonyDate()));

                preparedStatement.executeUpdate();

            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Exception in save: " + e.getMessage());
            }
            return true;
        }
        return false;
    }

    @SneakyThrows
    @Override
    public Optional<NamingCeremonyDto> findById(int id) {
        System.out.println("running findById in NamingCeremonyRepositoryImpl...");

        Class.forName("com.mysql.cj.jdbc.Driver");
        String findByIdSQL = "SELECT * FROM naming_ceremony_event WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
             PreparedStatement preparedStatement = connection.prepareStatement(findByIdSQL)) {

            System.out.println("findById: " + findByIdSQL);

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("resultSet: " + resultSet);

            while (resultSet.next()) {
                int pk = resultSet.getInt("id");
                String childName = resultSet.getString("child_name");
                String location = resultSet.getString("location");
                int numberOfGuests = resultSet.getInt("number_of_guests");
                boolean decorated = resultSet.getBoolean("decorated");
                LocalDate ceremonyDate = resultSet.getDate("ceremony_date").toLocalDate();

                NamingCeremonyDto dto = new NamingCeremonyDto();
                dto.setChildName(childName);
                dto.setLocation(location);
                dto.setNumberOfGuests(numberOfGuests);
                dto.setDecorated(decorated);
                dto.setCeremonyDate(ceremonyDate);

                return Optional.of(dto);
            }

        } catch (SQLException exception) {
            System.err.println("SQLException in findById " + exception.getMessage());
        }

        return Optional.empty();
    }
}
