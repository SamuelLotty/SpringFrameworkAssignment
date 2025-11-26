package org.example.springframeworkassignment.repositories;

import org.example.springframeworkassignment.daos.entities.Planet;
import org.example.springframeworkassignment.dto.PlanetDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Integer> {

    List<PlanetDTO> findPlanetByPlanetType(String planetType);

    @Query("Select p.planetName, p.massKG FROM Planet p")
    List<Object[]> findPlanetNameAndMass();

    @Modifying
    @Transactional
    @Query("DELETE FROM Planet p where p.planetID = :planetID")
    int deletePlanetById(@Param("planetID") int planetID);

}