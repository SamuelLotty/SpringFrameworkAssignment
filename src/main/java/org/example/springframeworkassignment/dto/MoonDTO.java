package org.example.springframeworkassignment.dto;

public record MoonDTO(
        int moonId,
        String moonName,
        int diameterKM,
        int orbitalDays,
        int planetId
        ) {
}

