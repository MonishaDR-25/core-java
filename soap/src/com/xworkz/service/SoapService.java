package com.xworkz.service;

import com.xworkz.dto.SoapDto;

import java.util.Optional;

public interface SoapService {
    String save(SoapDto soapDto);

    default Optional<SoapDto> findById(int id){
        return Optional.empty();
    }
}
