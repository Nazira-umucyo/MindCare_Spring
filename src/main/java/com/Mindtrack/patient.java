package com.Mindtrack;

import org.springframework.stereotype.Component;

@Component("patient")
public class patient extends Person {

    public patient() {
        super("Amina Uwase", 22, "amina@mindcare.com");
    }

    @Override
    public String getRole() { return "Patient"; }

    public String getDiagnosis() { return "Anxiety"; }
}

