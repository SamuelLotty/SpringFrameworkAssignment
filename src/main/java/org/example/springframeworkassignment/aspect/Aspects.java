package org.example.springframeworkassignment.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class Aspects {
    // Define a pointcut that matches any method named `findAll()` in any subpackage of `ie.spring.heroes`
    @Pointcut("execution(* org.example.springframeworkassignment.controller.RestService.*(..))")
    public void restMethods() {}

    // Advice that runs *before* any method matched by `findAll()`
    @Before("restMethods()")
    public void before(JoinPoint joinPoint) {
        // Logs the method signature before it executes
        log.info("✅ Before " + joinPoint.getSignature());
    }

    // Advice that runs *after* any method matched by `findAll()` (regardless of outcome)
    @After("restMethods()")
    public void after(JoinPoint joinPoint) {
        // Logs the method signature after it executes
        log.info("✅ After " + joinPoint.getSignature());
    }

    // Advice that runs *after successfully returning* from a method matched by `findAll()`
    @AfterReturning(value = "restMethods()", returning = "returned")
    public void afterReturning(JoinPoint joinPoint, Object returned) {
        // Logs the method signature and what it returned
        log.info("✅ AfterReturning " + joinPoint.getSignature() + " returned " + returned);
    }

    // Advice that runs when *any method in the package* throws an exception
    @AfterThrowing(value = "restMethods()", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex){
        // Logs the method and the exception message if one is thrown
        log.info("❌ After throwing " + joinPoint.getSignature() + " exception " + ex.getMessage());
    }

    }