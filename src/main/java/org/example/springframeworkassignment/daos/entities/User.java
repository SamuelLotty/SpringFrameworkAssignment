package org.example.springframeworkassignment.daos.entities;

import lombok .*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class User {
    private int userID;
    private String firstName;
    private String password;
    private String role;
    private boolean enabled;
}