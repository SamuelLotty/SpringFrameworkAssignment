package org.example.springframeworkassignment.dto;

import jakarta.persistence.*;
import org.example.springframeworkassignment.daos.entities.Planet;

public record MoonDTO(
        int moonId,
        String moonName,
        int diameterKM,
        int orbitalDays,
        PlanetDTO planet
) {
}

