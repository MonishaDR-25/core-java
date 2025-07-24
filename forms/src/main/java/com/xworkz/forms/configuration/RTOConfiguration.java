package com.xworkz.forms.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.forms")
public class RTOConfiguration {

    public RTOConfiguration(){
        System.out.println("Running Rto Configuration");
    }
}
