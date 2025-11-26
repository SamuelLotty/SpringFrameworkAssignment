package org.example.springframeworkassignment.dto;

import java.util.List;

public record PlanetDTO (
        int planetID,
        String planetName,
        String planetType,
        int radiusKM,
        int massKG,
        int orbitalPeriodDays,
        List<MoonDTO> moon

){};

