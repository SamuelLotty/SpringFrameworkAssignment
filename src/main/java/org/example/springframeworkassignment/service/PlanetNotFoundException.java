package org.example.springframeworkassignment.service;

public class PlanetNotFoundException extends RuntimeException {
    public PlanetNotFoundException(String s) {
        super (s);
    }
}
