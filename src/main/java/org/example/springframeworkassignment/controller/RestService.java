package org.example.springframeworkassignment.controller;


import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.Mappers;
import org.example.springframeworkassignment.dto.PlanetDTO;
import org.example.springframeworkassignment.service.MoonService;
import org.example.springframeworkassignment.service.PlanetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;

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
    public List<Planet> getAllPlanets() {
        return planetService.getAllPlanets();
    }

    @GetMapping(path = "/", headers = "")
    public List<Moon> findAll(){
        return  moonService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Planet> findbyId(@PathVariable("id") int id){
        return planetService.getPlanetById(id);
    }



}
