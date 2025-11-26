package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.PlanetDTO;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

public  interface PlanetService
{

    Planet AddNewPlanet(Planet planet);

    List<PlanetDTO> getAllPlanets();

    Optional<Planet> getPlanetById(int planetID);

    Planet updatePlanet(Planet planet);

    void deletePlanetById(int planetID);

    List<Planet> getPlanetsByType(String type);

    List<Planet> getPlanetNameAndMass(String type);
}
