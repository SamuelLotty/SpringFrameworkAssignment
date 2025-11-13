package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.springframework.data.repository.query.Param;
//a
import java.util.List;
import java.util.Optional;

public interface PlanetService
{
    Planet createPlanet(Planet planet);

    Planet updatePlanet(Planet planet);

    void deletePlanetById(int planetID);

    Optional<Planet> getPlanetById(int planetID);

    List<Planet> getPlanetsByType(String type);

    List<Planet> getAllPlanets();





}