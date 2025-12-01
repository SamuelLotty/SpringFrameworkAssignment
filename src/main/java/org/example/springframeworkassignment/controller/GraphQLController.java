package org.example.springframeworkassignment.controller;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.dto.NewUserDTO;
import org.example.springframeworkassignment.dto.UserDTO;
import org.example.springframeworkassignment.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class GraphQLController {
    private final UserService userService;


    @QueryMapping
    public UserDTO getUserByName(@Argument String username) {
        return userService.getUserByName(username);
    }

    @MutationMapping
    public UserDTO createUser(@Valid @Argument("newUser") NewUserDTO newUserDTO) {
        return userService.createUser(
                newUserDTO.username(),
                newUserDTO.password(),
                newUserDTO.role()
        );

    }
}

