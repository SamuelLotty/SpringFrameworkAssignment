package org.example.springframeworkassignment.service;

import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.repositories.PlanetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
@AllArgsConstructor

public class PlanetServiceImpl {

    private PlanetRepository planetRepository;


    //@Override
    public void deletePlanetById(int planetID) {
        int rowsDeleted = planetRepository.deletePlanetById(planetID);
        if(rowsDeleted== 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Planet with id " + planetID + " not found");
        }
    }

}
