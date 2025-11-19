package org.example.springframeworkassignment.repositories;

import org.example.springframeworkassignment.daos.entities.Moon;
import org.example.springframeworkassignment.daos.entities.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoonRepository extends JpaRepository<Moon, Integer>{

    //Delete moons by ID
    @Modifying
    @Transactional
    @Query("DELETE FROM Moon m WHERE m.moonId = :id")
    int deleteMoonById(@Param("id")int moonId);

    // Retrieve a list of all moons
    List <Moon> findAll();

    //Retrieve a list of moons by ID
    Optional<Moon> findById(@Param("id")int id);

    //Count number of moons by planet
    List<Moon> findAllByPlanet(Planet planet);
    int countByPlanet(Planet planet);

}
