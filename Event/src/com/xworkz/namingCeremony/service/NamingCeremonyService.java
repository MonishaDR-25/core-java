package com.xworkz.namingCeremony.service;

import com.xworkz.namingCeremony.dto.NamingCeremonyDto;

import java.util.Optional;

public interface NamingCeremonyService {
    boolean save(NamingCeremonyDto namingCeremonyDto);

    default Optional<NamingCeremonyDto> findById(int id) {
        return Optional.empty();
    }
}
