package org.example.springframeworkassignment.dto;

public record UserDTO(
        int userId,
        String username,
        String password,
        String role,
        boolean enabled
) {}
