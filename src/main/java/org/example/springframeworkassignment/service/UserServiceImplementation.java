package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.dto.UserDTO;
import org.example.springframeworkassignment.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDTO userFindById(int id) {
        return null;
    }

    @Override
    public UserDTO createUser(String username, String password, String role) {
        return null;
    }
}
