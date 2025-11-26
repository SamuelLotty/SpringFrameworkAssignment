package org.example.springframeworkassignment.service;

import org.example.springframeworkassignment.dto.Mappers;
import org.example.springframeworkassignment.dto.UserDTO;
import org.example.springframeworkassignment.repositories.UserRepository;
import org.springframework.stereotype.Service;

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
    public UserDTO getUserById(int id) {

        return Mappers.mapUserToUserDTO(userRepository.findByUserID(id));
    }

    @Override
    public UserDTO getUserByName(String username) {
        return Mappers.mapUserToUserDTO(userRepository.findByUserName(username));
    }

    @Override
    public UserDTO createUser(String username, String password, String role) {
        return null;
    }
}
