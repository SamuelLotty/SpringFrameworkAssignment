package org.example.springframeworkassignment.service;

import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.example.springframeworkassignment.daos.entities.MyUser;
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
        MyUser user = new MyUser();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        MyUser saved = userRepository.save(user);
        return Mappers.mapUserToUserDTO(saved);
    }
}
