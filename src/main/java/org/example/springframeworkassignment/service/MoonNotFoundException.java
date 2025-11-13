package org.example.springframeworkassignment.service;

public class MoonNotFoundException extends RuntimeException {
    public MoonNotFoundException(String s) {
        super (s);
    }
}
