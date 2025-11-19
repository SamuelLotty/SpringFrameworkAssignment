package org.example.springframeworkassignment.daos.entities;

import jakarta.persistence.*;
import lombok .*;

@Data
@Entity
@Table(name="User")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private int userID;

    @Column(nullable=false)
    private String firstName;
    @Column(nullable=false)
    private String password; //gotta hash this for security.
    @Column(nullable=false)
    private String role;
    private boolean enabled;
}