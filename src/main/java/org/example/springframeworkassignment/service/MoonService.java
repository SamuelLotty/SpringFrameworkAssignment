package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.exceptions.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface MoonService
{
    Moon save (Moon moon);
    List <Moon> findAll();
    void deletebyID(int ID) throws NotFoundException;
    List<Moon> findAllByPlanet(Planet planet);
    Optional<Moon> findbyID(int ID);
    int countByPlanet(Planet planet);
}