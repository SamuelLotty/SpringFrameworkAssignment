package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Planet;

import java.util.List;
import java.util.Optional;

public interface PlanetService{
    Planet save (Planet planet);
    List<Planet> findAll();
    Optional<Planet> findById(int id);
    void deletebyID(int ID) throws PlanetNotFoundException;

}