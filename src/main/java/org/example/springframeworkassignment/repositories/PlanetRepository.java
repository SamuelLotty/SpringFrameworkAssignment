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

public class PlanetRepository implements JpaRepository<Planet, Long> {

    List<Planet> findPlanetByType(String type);

    @Query("Select p.planetName, p.massKG from Planet p");
    List<Object[]> findPlanetNameAndMass();


    @Modifying
    @Transactional
    @Query("DELETE FROM Planet p where p.planetId = :id")
    int deleteById(@Param("planetId") int planetId);


//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Planet> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return List.of();
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Planet> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Planet getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Planet getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Planet getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Planet> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Planet> List<S> findAll(Example<S> example) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends Planet> List<S> findAll(Example<S> example, Sort sort) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends Planet> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Planet> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Planet> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Planet, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public <S extends Planet> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Planet> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Planet> List<S> saveAll(Iterable<S> entities) {
//        return List.of();
//    }
//
//    @Override
//    public Optional<Planet> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public List<Planet> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public List<Planet> findAllById(Iterable<Long> longs) {
//        return List.of();
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Planet entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Planet> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public List<Planet> findAll(Sort sort) {
//        return List.of();
//    }
//
//    @Override
//    public Page<Planet> findAll(Pageable pageable) {
//        return null;
//    }
//}
//
