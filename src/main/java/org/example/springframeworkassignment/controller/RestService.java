package org.example.springframeworkassignment.controller;


import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.service.MoonService;
import org.example.springframeworkassignment.service.PlanetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RestService {
    private MoonService moonService;
    private PlanetService planetService;

    @GetMapping(headers = "/", path = "")
    public List<Planet> getAllPlanets() {
        return planetService.getAllPlanets();
    }




}
