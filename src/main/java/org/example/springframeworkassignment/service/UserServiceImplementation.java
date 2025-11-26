package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.dto.Mappers;
import org.example.springframeworkassignment.dto.UserDTO;
import org.example.springframeworkassignment.exceptions.NotFoundException;
import org.example.springframeworkassignment.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.nio.channels.NotYetBoundException;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    private UserRepository userRepository;

//    @Override
//    public UserDTO getUserById(int id) {
//        Optional<MyUser> myUserOptional = userRepository.findByUserID(id);
//        if (myUserOptional.isPresent()) {
//            return myUserOptional.get();
//        }
//        throw new UsernameNotFoundException(id + " not found");
//    }



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
