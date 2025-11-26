package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.dto.UserDTO;

public interface UserService {

    UserDTO getUserByName(String username);

    UserDTO createUser (String username, String password, String role);
}

