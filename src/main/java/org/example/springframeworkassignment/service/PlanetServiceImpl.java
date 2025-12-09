package org.example.springframeworkassignment.service;

import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.Mappers;
import org.example.springframeworkassignment.dto.PlanetDTO;
import org.example.springframeworkassignment.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class PlanetServiceImpl implements PlanetService {

    private PlanetRepository planetRepository;


    @Override
    public PlanetDTO AddNewPlanet(PlanetDTO planetDTO) {
        Planet planet = Mappers.mapPlanetDTOToPlanet(planetDTO);
        Planet saved = planetRepository.save(planet);
        return Mappers.mapPlanetToPlanetDTO(saved);
    }

    @Override
    public List<PlanetDTO> getAllPlanets() {
        return planetRepository.findAll()
                .stream()
                .map(Mappers::mapPlanetToPlanetDTO)
                .toList();
    }

    @Override
    public Optional<Planet> getPlanetById(int planetID) {
        return planetRepository.findById(planetID);
    }


    @Override
    public PlanetDTO updatePlanet(PlanetDTO planetDTO) {
        Planet planet = Mappers.mapPlanetDTOToPlanet(planetDTO);
        Planet saved =  planetRepository.save(planet);
        return Mappers.mapPlanetToPlanetDTO(saved);
    }

    @Override
    public void deletePlanetById(int planetID) {
        int rowsDeleted = planetRepository.deletePlanetById(planetID);
        if(rowsDeleted== 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Planet with id " + planetID + " not found");
        }
    }

    @Override
    public List<PlanetDTO> getPlanetsByType(String type) {
        return planetRepository.findPlanetByPlanetType(type).stream().map(Mappers::mapPlanetToPlanetDTO).toList();
    }


    @Override
    public List<PlanetDTO> getPlanetNameAndMass(String type) {
        return null; //TODO
    }



}
