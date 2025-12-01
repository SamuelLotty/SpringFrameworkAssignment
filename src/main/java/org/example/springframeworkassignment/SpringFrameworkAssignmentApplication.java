package org.example.springframeworkassignment;

import org.example.springframeworkassignment.repositories.MoonRepository;
import org.example.springframeworkassignment.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkAssignmentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringFrameworkAssignmentApplication.class, args);
    }

    @Autowired
    PlanetService planetService;

    @Autowired
    MoonRepository moonService;

    @Override
    public void run(String... args) throws Exception {
//        planetService.getAllPlanets().forEach(System.out::println);
//        moonService.findAll().forEach(System.out::println);

    }
}
