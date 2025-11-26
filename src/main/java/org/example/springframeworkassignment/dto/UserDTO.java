package org.example.springframeworkassignment.dto;

public record UserDTO(
        String username,
        String password,
        String role,
        boolean enabled
) {}
