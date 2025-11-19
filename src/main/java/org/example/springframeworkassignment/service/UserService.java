package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.dto.UserDTO;
import org.springframework.stereotype.Service;


public interface UserService {

    UserDTO userFindById(int id);

    UserDTO createUser (String username, String password, String role);
}

