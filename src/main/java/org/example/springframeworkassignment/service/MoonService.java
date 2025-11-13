package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;

import java.util.List;

public interface MoonService
{
    Moon save (Moon moon);
    List <Moon> findAll();
    void deletebyID(int ID) throws MoonNotFoundException;
    List<Moon> findAllByPlanet(Planet planet);


}