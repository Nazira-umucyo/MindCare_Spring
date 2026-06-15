package com.Mindtrack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person patient = (Person) context.getBean("patient");
        Person therapist = (Person) context.getBean("therapist");

        System.out.println(" MindCare Spring Demo \n");

        System.out.println("- Patient Info -");
        patient.displayInfo();

        System.out.println("\n- Therapist Info -");
        therapist.displayInfo();
    }
}
