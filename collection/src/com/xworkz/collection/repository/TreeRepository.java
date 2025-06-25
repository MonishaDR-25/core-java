package com.xworkz.collection.repository;

import com.xworkz.collection.dto.TreeDto;

import java.util.Collection;

public interface TreeRepository {

    Collection<TreeDto> findAll();


}
