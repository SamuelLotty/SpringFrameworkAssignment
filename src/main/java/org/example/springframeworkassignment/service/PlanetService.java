package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.PlanetDTO;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

public  interface PlanetService
{

    Planet AddNewPlanet(Planet planet); //TODO

    List<PlanetDTO> getAllPlanets();

    Optional<Planet> getPlanetById(int planetID);

    PlanetDTO updatePlanet(PlanetDTO planetDTO);

    void deletePlanetById(int planetID);

    List<PlanetDTO> getPlanetsByType(String type);

    List<PlanetDTO> getPlanetNameAndMass(String type); //TODO
}
