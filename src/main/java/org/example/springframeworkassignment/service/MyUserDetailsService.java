package org.example.springframeworkassignment.service;

import lombok.AllArgsConstructor;
import org.example.springframeworkassignment.daos.entities.MyUser;
import org.example.springframeworkassignment.dto.UserDTO;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@AllArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private UserService userService;

    @Override
    public UserDetails loadUserById(int id) throws UsernameNotFoundException {
        // Get the user from our database
        UserDTO myUser = userService.getUserById(id);

        // Get a datastructure ready to hold the authorities of the user (ADMIN etc)
        SimpleGrantedAuthority simpleGrantedAuthority =  new SimpleGrantedAuthority(myUser.getRole());

        // Create a Spring User object against which Spring authenticates and authorises
        return new User(
                myUser.getEmail(),
                myUser.getPassword(),
                myUser.isEnabled(),
                true,
                true,
                myUser.isUnlocked(),
                Collections.singletonList(simpleGrantedAuthority));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}