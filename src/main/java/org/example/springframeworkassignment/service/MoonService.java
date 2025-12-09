package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.MoonDTO;

import java.util.List;

public interface MoonService
{
    MoonDTO save (MoonDTO moonDTO); //TODO
    List<MoonDTO> findAllMoons();
    void  deleteById(int moonId);
    List<MoonDTO> findAllByPlanet(int planetId);
    MoonDTO findById(int moonId);
    int countByPlanet(Planet planet); //TODO
}

// REPORT SHOULD REFLECT UNDERSTANDING OF SPRING
// GEN-AI generated GOOD CODE AND PUT IT IN THE ARCHITECTURE,it followed spring best practice, included JPA practices.
// challenge it if it does it differently, depth knoweldge of spring in the report.