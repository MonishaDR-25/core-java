package com.xworkz.icecream.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.icecream")
public class IceCreamConfiguration {

    public IceCreamConfiguration(){
        System.out.println("Running Ice Cream Configuration");
    }
}
