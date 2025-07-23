package com.xworkz.showroom.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.showroom")
public class ShowroomConfig {

    public ShowroomConfig(){
        System.out.println("Running ShowroomConfig");

    }
}
