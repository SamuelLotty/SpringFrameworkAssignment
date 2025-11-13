package org.example.springframeworkassignment.repositories;

import org.example.springframeworkassignment.daos.entities.Planet;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface PlanetRepository extends JpaRepository<Planet, Integer> {

    List<Planet> findPlanetByType(String planetType);

    @Query("Select p.planetName, p.massKG FROM Planet p")
    List<Object[]> findPlanetNameAndMass();


    @Modifying
    @Transactional
    @Query("DELETE FROM Planet p where p.planetID = :planetID")
    public int deletePlanetById(@Param("planetID") int planetID);

}