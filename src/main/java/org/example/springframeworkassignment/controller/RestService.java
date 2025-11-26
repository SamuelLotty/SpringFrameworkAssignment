package org.example.springframeworkassignment.controller;


import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.MoonDTO;
import org.example.springframeworkassignment.dto.PlanetDTO;
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
    public List<PlanetDTO> getAllPlanets() {
        return planetService.getAllPlanets();
    }
    @GetMapping(headers = "/", path = "")
    public List<MoonDTO> findAllMoons() {
        return moonService.findAllMoons();
    }




}
