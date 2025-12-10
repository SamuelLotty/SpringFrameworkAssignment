package org.example.springframeworkassignment.dto;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.MyUser;
import org.example.springframeworkassignment.daos.entities.Planet;

import java.util.List;

public class Mappers {

    public static Moon mapMoonDTOtoMoon(MoonDTO moonDTO) {
        Moon moon = new Moon();
        moon.setMoonName(moonDTO.moonName());
        moon.setMoonId(moonDTO.moonId());
        moon.setDiameterKM(moonDTO.diameterKM());
        moon.setOrbitalPeriodDays(moonDTO.orbitalDays());

        Planet planet = new Planet();
        planet.setPlanetID(moonDTO.planet().planetID());
        moon.setPlanet(planet);
        return moon;
    }

    public static MoonDTO mapMoonToMoonDTO(Moon moon){
        return new MoonDTO(
                moon.getMoonId(),
                moon.getMoonName(),
                moon.getDiameterKM(),
                moon.getOrbitalPeriodDays(),
                moon.getPlanet().getPlanetID()
        );

    }
    //planet to planet dto
    public static PlanetDTO  mapPlanetToPlanetDTO(Planet planet){
        List<MoonDTO> moonDTOS = (planet.getMoon() == null)
                ? List.of()
                : planet.getMoon()
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
    public static Moon mapMoonDTOToMoon(MoonDTO dto) {
        Moon moon = new Moon();
        moon.setMoonId(dto.moonId());
        moon.setMoonName(dto.moonName());
        moon.setDiameterKM(dto.diameterKM());
        moon.setOrbitalPeriodDays(dto.orbitalDays());
        return moon;
    }
    public static Planet mapPlanetDTOToPlanet(PlanetDTO dto) {
        Planet planet = new Planet();
        planet.setPlanetID(dto.planetID());
        planet.setPlanetName(dto.planetName());
        planet.setPlanetType(dto.planetType());
        planet.setRadiusKM(dto.radiusKM());
        planet.setMassKG(dto.massKG());
        planet.setOrbitalPeriodDays(dto.orbitalPeriodDays());
        return planet;
    }
    public static UserDTO mapUserToUserDTO(MyUser user) {
        return new UserDTO(
                user.getUsername(),
                user.getPassword(),
                user.getRole(),
                user.isEnabled()
        );
    }


}
