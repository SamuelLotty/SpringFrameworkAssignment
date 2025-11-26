package org.example.springframeworkassignment.repositories;

import org.example.springframeworkassignment.daos.entities.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser,Integer> {

    MyUser findByUserID(int userId);
    MyUser findByUserName(String username);
}
