# MindCare Spring

A simple Java project that demonstrates core Spring Framework concepts using classes from the MindCare Mental Health System.

## What it covers
- `@Component` — marks Patient and Therapist as Spring beans
- `@Configuration` — marks AppConfig as a Spring configuration class
- `@Bean` — registers Patient and Therapist beans manually
- `@Qualifier` — specifies which bean to inject when multiple options exist

## Classes
- `Person` — abstract base class
- `Patient` — extends Person, registered as a Spring bean
- `Therapist` — extends Person, registered as a Spring bean
- `AppConfig` — Spring configuration class
- `Main` — entry point, runs the Spring container

## Tech
- Java 25
- Spring Framework 5.3.30
- Maven
