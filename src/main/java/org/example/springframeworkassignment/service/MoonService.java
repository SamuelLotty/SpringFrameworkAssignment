package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;

import java.util.List;
import java.util.Optional;

public interface MoonService
{
    Moon save (Moon moon);
    List <Moon> findAll();
    void deletebyID(int ID); //throws MoonNotFoundException;
    List<Moon> findAllByPlanet(Planet planet);
    Optional<Moon> findbyID(int ID);
    int countByPlanet(Planet planet);
}



//rEPORT SHOULD REFLECT UNDERSTANDING OF SPRING
// GEN-AI generated GOOD CODE AND PUT IT IN THE ARCHITECTURE,it followed spring best practice, included JPA practices.
// challenge it if it does it differently, depth knoweldge of spring in the report.