package org.example.springframeworkassignment.dto;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;

import java.util.List;

public class Mappers {
    //moon to moon dto
    public static MoonDTO mapMoonToMoonDTO(Moon moon){
        return new MoonDTO(
                moon.getMoonId(),
                moon.getMoonName(),
                moon.getDiameterKM(),
                moon.getOrbitalPeriodDays(),
                mapPlanetToPlanetDTO(moon.getPlanet())

        );

    }
    //planet to planet dto
    public static PlanetDTO  mapPlanetToPlanetDTO(Planet planet){
        List<MoonDTO> moonDTOS =
                planet.getMoon()
                        .stream()
                        .map(Mappers::mapMoonToMoonDTO)
                        .toList();

        return new PlanetDTO(
                planet.getPlanetID(),
                planet.getPlanetName(),
                planet.getPlanetType(),
                planet.getRadiusKM(),
                planet.getMassKG(),
                planet.getOrbitalPeriodDays(),
                moonDTOS

        );

    }
    public static Planet mapPlanetDTOToPlanet(PlanetDTO dto) {
        Planet planet = new Planet();
        planet.setPlanetID(dto.planetID());
        planet.setPlanetName(dto.planetName());
        planet.setPlanetType(dto.planetType());
        planet.setRadiusKM(dto.radiusKM());
        planet.setMassKG(dto.massKG());
        planet.setOrbitalPeriodDays(dto.orbitDay());
        return planet;
    }


}
