package com.srmamilla.cms.configuration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })

public class MainApplication extends SpringBootServletInitializer {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);
    
    private static Class<MainApplication> applicationClass = MainApplication.class;

   

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}