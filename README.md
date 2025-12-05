# Spring Framework

A Spring Boot application demonstrating a **modular, layered architecture**, with **REST** and **GraphQL** endpoints, **authentication**, and centralized **exception handling**.

## About

The goal is to showcase a well-structured Spring Boot backend application using modern development practices. It combines:

- RESTful web services  
- GraphQL API  
- Authentication (e.g., JWT / Spring Security)  
- Exception handling  
- Clean, layered architecture (controller, service, repository)
- Security Layer

---

## Features

- **REST endpoints** for CRUD operations  
- **GraphQL queries** and mutations  
- **User authentication** (login, registration)  
- **Global exception handling** using `@ControllerAdvice`  
- **Modular codebase**: separation of concerns via layers  
- **Configuration** via `application.properties` (or `application.yml`)  
- **Future testability** (unit / integration tests)

---

## Architecture

The application follows a **layered architecture**, which is a best practice in Spring Boot development. 

Here is a breakdown of the layers:

1. **Controller / API Layer**  
   - Exposes REST controllers  
   - Exposes GraphQL resolvers  
2. **Service Layer**  
   - Contains business logic  
   - Orchestrates between controller and repository  
3. **Repository / Data Layer**  
   - Interfaces with the database (e.g., via Spring Data JPA)  
4. **Exception Layer**  
   - Centralized handling of exceptions via `@ControllerAdvice`
5. **Security Layer**
   - Security Layer with user access.

This layered structure improves maintainability, testability, and separation of concerns. :contentReference[oaicite:1]{index=1}  

---

## Tech Stack

- **Java** (version depending on your `pom.xml`)  
- **Spring Boot**  
- **Spring Web** (REST)  
- **Spring Security** (for authentication)  
- **Spring GraphQL**  
- **Spring Data JPA** (or another persistence mechanism)  
- **Maven** (build tool)  

---

### Prerequisites

- Java JDK (e.g., Java 11 or later)  
- Maven

### Installation

1. Clone the repository:  
   ```bash
   git clone https://github.com/SamuelLotty/SpringFrameworkAssignment.git
   cd SpringFrameworkAssignment
   open in IntelliJ 
