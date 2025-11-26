package org.example.springframeworkassignment.daos.entities;

import jakarta.persistence.*;
import lombok .*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MyUser {


    @Id
    @Column(name="username",nullable=false)
    private String username;
    @Column(nullable=false)
    private String password; //I've to hash this for security.
    @Column(nullable=false)
    private String role;
    private boolean enabled;
}
