package org.example.springframeworkassignment.repositories;

import org.example.springframeworkassignment.daos.entities.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<MyUser,Integer> {

    Optional<MyUser> findByUserID(int userID);
}
