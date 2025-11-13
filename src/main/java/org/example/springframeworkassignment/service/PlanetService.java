package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.springframework.data.repository.query.Param;
//a
import java.util.List;

public interface PlanetService
{
    Planet createPlanet(Planet planet);

    Planet updatePlanet(Planet planet);

    void deletePlanetById(int planetID);

    Planet getPlanetById(int planetID);

    List<Planet> getAllPlanets();





}