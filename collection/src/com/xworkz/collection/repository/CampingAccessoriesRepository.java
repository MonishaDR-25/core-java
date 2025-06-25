package com.xworkz.collection.repository;

import com.xworkz.collection.dto.CampingAccessoriesDto;

import java.util.Collection;

public interface CampingAccessoriesRepository {
    Collection<CampingAccessoriesDto> findAll();
}
