package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.daos.entities.MyUser;
import org.example.springframeworkassignment.dto.UserDTO;
import org.example.springframeworkassignment.repositories.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDTO getUserById(int id) {
        Optional<MyUser> myUserOptional = userRepository.findById(id);
        if (myUserOptional.isPresent()) {
            return myUserOptional.get();
        }
        throw new UsernameNotFoundException(id + " not found");
    }

    @Override
    public UserDTO createUser(String username, String password, String role) {
        return null;
    }
}
