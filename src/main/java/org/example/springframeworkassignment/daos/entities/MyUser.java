package org.example.springframeworkassignment.daos.entities;

import jakarta.persistence.*;
import lombok .*;

@Data
@Entity
@Table(name="MyUser")
@NoArgsConstructor
@AllArgsConstructor
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private int userID;

    @Column(name="username",nullable=false)
    private String firstName;
    @Column(nullable=false)
    private String password; //I've to hash this for security.
    @Column(nullable=false)
    private String role;
    private boolean enabled;
}
