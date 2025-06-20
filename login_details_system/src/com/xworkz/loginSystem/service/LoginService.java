package com.xworkz.loginSystem.service;

import com.xworkz.loginSystem.dto.LoginDto;

public interface LoginService {
    boolean save(LoginDto loginDto);
    LoginDto[] findAll();

}
