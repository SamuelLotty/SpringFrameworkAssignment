package org.example.springframeworkassignment.dto;

public record UserDTO(
        int userId,
        String username,
        String role,
        boolean enabled
) {}
