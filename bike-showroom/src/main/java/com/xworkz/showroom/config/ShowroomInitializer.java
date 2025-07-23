package com.xworkz.showroom.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ShowroomInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Running getRootConfigClasses");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Running getServletConfigClasses");
        return new Class[]{ShowroomConfig.class,NameConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Running getServletMappings ");
        return new String[] {"/"};
    }
}
