package org.example.springframeworkassignment.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.MoonDTO;
import org.example.springframeworkassignment.dto.PlanetDTO;
import org.example.springframeworkassignment.exceptions.NotFoundException;
import org.example.springframeworkassignment.service.MoonService;
import org.example.springframeworkassignment.service.PlanetService;
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
    @Operation(summary = "Lists all planets",description = "Retrieve a list of all planets within the database")
    @GetMapping("/planets")
    public List<PlanetDTO> getAllPlanets() {
        return planetService.getAllPlanets();
    }
    @Operation(summary = "List of all moons",description = "Retrieve a list of all moons within the database")
    @GetMapping("/moons")
    public List<MoonDTO> getAllMoons(){
        return  moonService.findAllMoons();
    }
    @Operation(summary = "Find a planet by Id", description = "Retrieve a list of planets based on the ID")
    @GetMapping("/planet/{id}")
    public Optional<Planet> findPlanetId(@PathVariable("id") int id){
        return planetService.getPlanetById(id);
    }
    @Operation(summary = "Find a moon by Id",description = "Retrieve a list of moons based on the ID")
    @GetMapping("/moons/moon/{id}")
    public Optional<Moon> findMoonId(@PathVariable("id") int id){
        return moonService.findById(id);
    }
    @Operation(summary = "Delete planet by ID", description = "Deletes a planet based on the ID")
    @DeleteMapping({"/deletePlanet/planet/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlanet(@PathVariable("id") int id) throws NotFoundException
    {
        planetService.deletePlanetById(id);
    }
    @Operation(summary = "Delete moon by ID", description = "Deletes a planet based on the ID")
    @DeleteMapping({"/deleteMoon/moons/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMoon(@PathVariable("id") int id) throws NotFoundException
    {
        moonService.deleteById(id);
    }
    @Operation
    @PatchMapping({"/",""})
    public void changePlanetDetails(@RequestBody PlanetDTO planetDTO) {
       // planetService.updatePlanet(planetDTO.planetID(),planetDTO.)
    }

}
