package com.xworkz.loginSystem.dto;

import com.xworkz.loginSystem.constant.LoginConstant;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginDto {

    private int id;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String createdBy = LoginConstant.SYSTEM.toString();
    private Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());
}
