package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.dto.UserDTO;

public interface UserService {

    UserDTO userFindById(int id);

    UserDTO createUser (String username, String password, String role);
}

