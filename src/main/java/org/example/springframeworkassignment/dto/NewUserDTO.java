package org.example.springframeworkassignment.dto;

import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

public record NewUserDTO(@NotBlank(message = "Username should not be blank.")
                         @NotNull String username,
                         @NotBlank(message =" Password should not be blank")
                         @NotNull String password,
                         @NotBlank(message = "Role should not be blank")
                         @NotNull String role)
{}


