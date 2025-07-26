package com.xworkz.task.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.task")
public class LoanConfiguration {

    public LoanConfiguration(){
        System.out.println("Running Loan Configuration");
    }
}
