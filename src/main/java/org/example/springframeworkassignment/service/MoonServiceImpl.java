package org.example.springframeworkassignment.service;

import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.Mappers;
import org.example.springframeworkassignment.dto.MoonDTO;
import org.example.springframeworkassignment.repositories.MoonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MoonServiceImpl implements MoonService {

    private MoonRepository moonRepository;

    @Override
    public Moon save(Moon moon) {
        return  moonRepository.save(moon);
    }

    @Override
    public List<MoonDTO> findAllMoons() {

        return  moonRepository.findAll()
                .stream()
                .map(Mappers::mapMoonToMoonDTO)
                .toList();
    }

    @Override
    public void deletebyID(int moonId) {
    int rowsDeleted = moonRepository.deleteMoonById(moonId);
    if(rowsDeleted > 0){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Moon with id" + moonId + "not found!");
    }
    }

    @Override
    public List<Moon> findAllByPlanet(Planet planet) {
        return moonRepository.findAllByPlanet(planet);
                                                        // Entire object of planet anyway, JPA will get the id

    }

    @Override
    public Optional<Moon> findById(int id) {
        return moonRepository.findById(id);
    }

    @Override
    public int countByPlanet(Planet planet) {
        return moonRepository.countByPlanet(planet);
    }
}
