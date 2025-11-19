package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
public class PlanetServiceImpl implements PlanetService {

    @Autowired
    private PlanetRepository planetRepository;


    @Override
    public Planet AddNewPlanet(Planet planet) {
        return planetRepository.save(planet);
    }

    @Override
    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

    @Override
    public Optional<Planet> getPlanetById(int planetID) {
        return planetRepository.findById(planetID);
    }


    @Override
    public Planet updatePlanet(Planet planet) {
        return planetRepository.save(planet);
    }

    @Override
    public void deletePlanetById(int planetID) {
        int rowsDeleted = planetRepository.deletePlanetById(planetID);
        if(rowsDeleted== 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Planet with id " + planetID + " not found");
        }
    }

    @Override
    public List<Planet> getPlanetsByType(String type) {
        return planetRepository.findPlanetByPlanetType(type);
    }


    @Override
    public List<Planet> getPlanetNameAndMass(String type) {
        return null;
    }



}
