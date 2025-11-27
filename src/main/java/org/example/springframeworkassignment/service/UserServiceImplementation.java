package org.example.springframeworkassignment.service;

import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.dto.Mappers;
import org.example.springframeworkassignment.dto.UserDTO;
import org.example.springframeworkassignment.exceptions.NotFoundException;
import org.example.springframeworkassignment.repositories.UserRepository;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserServiceImplementation implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDTO getUserByName(String username) {
        return Mappers.mapUserToUserDTO(userRepository.findById(username).orElseThrow(()->new NotFoundException("User not found")));
    }

    @Override
    public UserDTO createUser(String username, String password, String role) {
        //TODO
        return null;
    }
}
