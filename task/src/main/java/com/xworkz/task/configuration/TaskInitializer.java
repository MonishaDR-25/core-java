package com.xworkz.task.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TaskInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{NameConfiguration.class, LoanConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/saveName","/saveLoan"};
    }
}
