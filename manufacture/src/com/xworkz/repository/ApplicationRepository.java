package com.xworkz.repository;

import com.xworkz.dto.ApplicationDto;

import java.util.Collection;

public interface ApplicationRepository {
    Collection<ApplicationDto> findAll();
}
