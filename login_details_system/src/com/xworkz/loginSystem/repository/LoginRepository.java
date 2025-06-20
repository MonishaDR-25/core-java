package com.xworkz.loginSystem.repository;

import com.xworkz.loginSystem.dto.LoginDto;

public interface LoginRepository {
    boolean persist(LoginDto loginDto);
    LoginDto[] findAll();
}
