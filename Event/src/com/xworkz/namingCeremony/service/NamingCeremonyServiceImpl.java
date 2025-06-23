package com.xworkz.namingCeremony.service;

import com.xworkz.namingCeremony.dto.NamingCeremonyDto;
import com.xworkz.namingCeremony.repository.NamingCeremonyRepository;
import com.xworkz.namingCeremony.repository.NamingCeremonyRepositoryImpl;

import java.util.Optional;

public class NamingCeremonyServiceImpl implements NamingCeremonyService {

    @Override
    public boolean save(NamingCeremonyDto namingCeremonyDto) {
        boolean valid = true;

        if (namingCeremonyDto == null) {
            System.out.println("DTO returning null");
            valid = false;
        }

        if (namingCeremonyDto.getChildName() == null) {
            System.out.println("Invalid child name");
            valid = false;
        }

        if (namingCeremonyDto.getLocation() == null) {
            System.out.println("Invalid location");
            valid = false;
        }

        if (namingCeremonyDto.getNumberOfGuests() <= 0 || namingCeremonyDto.getNumberOfGuests() > 500) {
            System.out.println("Invalid number of guests");
            valid = false;
        }

        if (namingCeremonyDto.getCeremonyDate() == null) {
            System.out.println("Invalid ceremony date");
            valid = false;
        }

        // decorated is boolean (primitive), no null check needed

        System.out.println("data is valid, will save into DB using repo...");

        NamingCeremonyRepository repository = new NamingCeremonyRepositoryImpl();
        boolean repo = repository.persist(namingCeremonyDto);

        return valid;
    }

    @Override
    public Optional<NamingCeremonyDto> findById(int id) {
        System.out.println("running findById in NamingCeremonyServiceImpl...");
        if (id > 0) {
            System.out.println("id is valid: " + id);
            NamingCeremonyRepository repository = new NamingCeremonyRepositoryImpl();
            return repository.findById(id);
        }

        return NamingCeremonyService.super.findById(id);
    }
}
