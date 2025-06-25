package com.xworkz.collection.repository;

import com.xworkz.collection.dto.AppliancesDto;

import java.util.Collection;

public interface AppliancesRepository {
    Collection<AppliancesDto> findAll();
}
