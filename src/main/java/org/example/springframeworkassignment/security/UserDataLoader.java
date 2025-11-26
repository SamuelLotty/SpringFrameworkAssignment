//package org.example.springframeworkassignment.security;
//
//import lombok.AllArgsConstructor;
//import org.example.springframeworkassignment.daos.entities.MyUser;
//import org.example.springframeworkassignment.repositories.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//@AllArgsConstructor
//public class UserDataLoader implements CommandLineRunner {
//    PasswordEncoder passwordEncoder;
//    UserRepository userRepository;
//    @Override
//    public void run(String... args) throws Exception {
//        MyUser user1 =  new MyUser();
//        MyUser user2 =  new MyUser();
//        user1.setUsername("admin");
//        user1.setPassword(passwordEncoder.encode("admin"));
//        user1.setRole("ROLE_ADMIN");
//        user1.setEnabled(true);
//
//        user2.setUsername("user");
//        user2.setPassword(passwordEncoder.encode("user"));
//        user2.setRole("ROLE_USER");
//        user2.setEnabled(true);
//
//        userRepository.save(user1);
//        userRepository.save(user2);
//
//
//
//    }
//}
