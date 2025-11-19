package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;

import java.util.List;
import java.util.Optional;

public interface MoonService
{
    Moon save (Moon moon);
    List <Moon> findAll();
    void deletebyID(int moonId); //throws MoonNotFoundException;
    List<Moon> findAllByPlanet(Planet planet);
    Optional<Moon> findById(int moonId);
    int countByPlanet(Planet planet);
}



// REPORT SHOULD REFLECT UNDERSTANDING OF SPRING
// GEN-AI generated GOOD CODE AND PUT IT IN THE ARCHITECTURE,it followed spring best practice, included JPA practices.
// challenge it if it does it differently, depth knoweldge of spring in the report.