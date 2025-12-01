package org.example.springframeworkassignment.repositories;

import org.example.springframeworkassignment.daos.entities.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<MyUser,String> {

    Optional<MyUser> findByUsername(String username);
    //TODO what is the point of this?
}
