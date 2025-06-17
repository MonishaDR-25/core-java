package com.xworkz.repository;

import com.xworkz.dto.SoapDto;

import java.util.Optional;

public interface SoapRepository {
    String persist(SoapDto soapDto);

    default Optional<SoapDto> findById(int id){
        return Optional.empty();
    }
}
