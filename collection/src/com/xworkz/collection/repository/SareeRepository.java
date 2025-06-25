package com.xworkz.collection.repository;

import com.xworkz.collection.dto.SareeDto;

import java.util.Collection;

public interface SareeRepository {

    Collection<SareeDto> findAll();

}
