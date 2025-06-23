package com.xworkz.namingCeremony.repository;

import com.xworkz.namingCeremony.dto.NamingCeremonyDto;

import java.util.Optional;

public interface NamingCeremonyRepository {
    boolean persist(NamingCeremonyDto namingCeremonyDto);

   default Optional<NamingCeremonyDto> findById(int id){
       return Optional.empty();
   }
}
