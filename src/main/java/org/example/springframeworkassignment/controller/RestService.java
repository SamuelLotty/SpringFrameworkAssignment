package org.example.springframeworkassignment.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.MoonDTO;
import org.example.springframeworkassignment.dto.PlanetDTO;
import org.example.springframeworkassignment.dto.PlanetNameMassDTO;
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
    @GetMapping("/planets/{id}")
    public Optional<Planet> findPlanetId(@PathVariable("id") int id){
        return planetService.getPlanetById(id);
    }

    @Operation(summary = "Find a moon by Id",description = "Retrieve a list of moons based on the ID")
    @GetMapping("/moons/{id}")
    public MoonDTO findMoonId(@PathVariable("id") int id){
        return moonService.findById(id);
    }

    @Operation(summary = "Delete planet by ID", description = "Deletes a planet based on the ID")
    @DeleteMapping({"/planets/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlanet(@PathVariable("id") int id) throws NotFoundException
    {
        planetService.deletePlanetById(id);
    }

    @Operation(summary = "Delete moon by ID", description = "Deletes a planet based on the ID")
    @DeleteMapping({"/moons/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMoon(@PathVariable("id") int id) throws NotFoundException
    {moonService.deleteById(id);}

    @Operation(summary = "Update details of planet",description = "Updates details of a specific planet based on ID")
    @PatchMapping({"/planets"})
    public void updatePlanet(@RequestBody PlanetDTO planetDTO) {
       planetService.updatePlanet(planetDTO);
    }

    @Operation(summary = "List moons by planet",description = "List the moons for each planet based on ID")
    @GetMapping("/planets/moons/")
    public List<MoonDTO> getMoonsByPlanet(@RequestParam("id") int id){
        return moonService.findAllByPlanet(id);
    }

    @Operation(summary = "Retrieve planets based on type",description = "Retrieve planets based on what type of planet they are")
    @GetMapping("/planets/")
    public List<PlanetDTO> getPlanetsByType(@RequestParam("type") String type){
        return planetService.getPlanetsByType(type);
    }
    @GetMapping("/planets/moons/count")
    public int countMoonsByPlanet(@RequestParam("id") int id) {
        return moonService.countByPlanet(id);
    }

    @Operation(summary= "Retrieve planet name and mass only", description = "get a list of all planets just giving their mass and planet name")
    @GetMapping("/planets/name-mass")
    public List<PlanetNameMassDTO> getPlanetsByName(){
        return planetService.getPlanetNameAndMass();
    }

    @Operation(summary = "Save Moon", description = "Save moon to database.")
    @PostMapping("/moons/entity")
    @ResponseStatus(HttpStatus.CREATED)
    public MoonDTO saveMoon(@RequestBody MoonDTO moonDTO) {
        return moonService.save(moonDTO);
    }
    @Operation(summary = "Create Moon", description = "Creates moon in the  database.")
    @PostMapping("/moons")
    @ResponseStatus(HttpStatus.CREATED)
    public MoonDTO createMoon(@RequestBody MoonDTO moonDTO) {
        return moonService.save(moonDTO);
    }

    @Operation(summary = "Create Planet", description = "Creates planet in database.")
    @PostMapping("/planets")
    @ResponseStatus(HttpStatus.CREATED)
    public PlanetDTO createPlanet(@RequestBody PlanetDTO planetDTO) {
        return planetService.AddNewPlanet(planetDTO);
    }




}
