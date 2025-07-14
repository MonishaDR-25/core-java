package com.xworkz.set.repository;

import com.xworkz.set.dto.SweetDto;

import java.util.Set;

public interface SweetRepository {
    Set<SweetDto> findAll();
}
