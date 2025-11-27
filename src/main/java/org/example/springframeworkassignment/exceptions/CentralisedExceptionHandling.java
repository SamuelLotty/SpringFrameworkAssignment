package org.example.springframeworkassignment.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CentralisedExceptionHandling {


    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, Object> handleNotFoundException(NotFoundException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", e.getMessage());
        map.put("status", HttpStatus.NOT_FOUND);
        map.put("code", HttpStatus.NOT_FOUND.value());
        map.put("timestamp", LocalDateTime.now());
        return map;
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Map<String, Object> handleAlreadyExists(DataIntegrityViolationException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", e.getMessage());
        map.put("status", HttpStatus.CONFLICT);
        map.put("code", HttpStatus.CONFLICT.value());
        map.put("timestamp", LocalDateTime.now());
        return map;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, Object> handleBadAttributeValue(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage()));

        Map<String, Object> map = new HashMap<>();
        map.put("errors", errors);
        map.put("status", HttpStatus.BAD_REQUEST);
        map.put("code", HttpStatus.BAD_REQUEST.value());
        map.put("timestamp", LocalDateTime.now());
        return map;
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, Object> handleHttpMessageNotReadableException() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "Your request contains malformed JSON");
        map.put("status", HttpStatus.BAD_REQUEST);
        map.put("code", HttpStatus.BAD_REQUEST.value());
        map.put("timestamp", LocalDateTime.now());
        return map;
    }
}

