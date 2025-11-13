package org.example.springframeworkassignment.daos.entities;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class Planet {
    private int planetID;
    private String planetName;
    private String planetType;
    private int radiusKM;
    private int massKG;
    private int orbitDays;
}