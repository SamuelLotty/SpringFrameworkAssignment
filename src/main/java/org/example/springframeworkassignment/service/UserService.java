package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.dto.UserDTO;

public interface UserService {

    UserDTO getUserById(String id);

    UserDTO getUserByName(String username);

    UserDTO createUser (String username, String password, String role);
}

