package com.xworkz.forms.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.forms")
public class HospitalConfiguration {

    public HospitalConfiguration(){
        System.out.println("Running Hospital Configuration");
    }
}
