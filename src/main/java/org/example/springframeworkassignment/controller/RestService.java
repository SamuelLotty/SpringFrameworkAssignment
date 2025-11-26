package org.example.springframeworkassignment.controller;


import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.MoonDTO;
import org.example.springframeworkassignment.dto.PlanetDTO;
import org.example.springframeworkassignment.exceptions.NotFoundException;
import org.example.springframeworkassignment.service.MoonService;
import org.example.springframeworkassignment.service.PlanetService;
import org.example.springframeworkassignment.service.PlanetServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RestService {
    private MoonService moonService;
    private PlanetService planetService;

    //Ask about Headers = and path =

    @GetMapping(headers = "/", path = "")
    public List<PlanetDTO> getAllPlanets() {
        return planetService.getAllPlanets();
    }

    @GetMapping(path = "/", headers = "")
    public List<MoonDTO> findAll(){
        return  moonService.findAllMoons();
    }

    @GetMapping("/{id}")
    public Optional<Planet> findPlanetId(@PathVariable("id") int id){
        return planetService.getPlanetById(id);
    }

    @GetMapping("/{id}")
    public Optional<Moon> findMoonId(@PathVariable("id") int id){
        return moonService.findById(id);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlanet(@PathVariable("id") int id) throws NotFoundException
    {
        //PlanetService.deletePlanetById(id);
    }
}
