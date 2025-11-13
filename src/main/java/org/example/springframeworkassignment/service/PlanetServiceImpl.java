package org.example.springframeworkassignment.service;

import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.repositories.PlanetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class PlanetServiceImpl implements PlanetService{

    private PlanetRepository planetRepository;


    @Override
    public Planet createPlanet(Planet planet) {
        return planetRepository.save(planet);
    }

    @Override
    public Planet updatePlanet(Planet planet) {
        return (Planet) planetRepository.findAll();
    }

    //@Override
    public void deletePlanetById(int planetID) {
        int rowsDeleted = planetRepository.deletePlanetById(planetID);
        if(rowsDeleted== 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Planet with id " + planetID + " not found");
        }
    }

    @Override
    public Optional<Planet> getPlanetById(int planetID) {
        return planetRepository.findById(planetID);
    }

    @Override
    public List<Planet> getPlanetsByType(String type) {
        return planetRepository.findPlanetByType(type);
    }

    @Override
    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

}
