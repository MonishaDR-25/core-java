package com.xworkz.forms.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.forms")
public class PoliceStationConfiguration {

    public PoliceStationConfiguration(){
        System.out.println("Running Police Station Configuration");
    }
}
