package com.Mindtrack;

import org.springframework.stereotype.Component;

@Component("therapist")
public class Therapist extends Person {

    public Therapist() {
        super("Dr. Jean Pierre", 40, "jean@mindcare.com");
    }

    @Override
    public String getRole() { return "Therapist"; }

    public String getSpecialty() { return "Cognitive Behavioral Therapy"; }
}
