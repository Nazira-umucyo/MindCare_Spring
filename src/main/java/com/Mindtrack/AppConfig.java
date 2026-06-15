package com.Mindtrack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("patient")
    public patient patient() {
        return new patient();
    }

    @Bean("therapist")
    public Therapist therapist() {
        return new Therapist();
    }
}
