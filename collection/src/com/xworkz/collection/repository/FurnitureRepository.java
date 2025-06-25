package com.xworkz.collection.repository;

import com.xworkz.collection.dto.FurnitureDto;

import java.util.Collection;

public interface FurnitureRepository {
    Collection<FurnitureDto> findAll();
}
