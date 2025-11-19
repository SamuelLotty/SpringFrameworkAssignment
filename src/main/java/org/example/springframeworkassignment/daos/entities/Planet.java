package org.example.springframeworkassignment.daos.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="planet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="planetID")
    private int planetID;

    @Column(nullable=false, unique=true)
    private String planetName;

    private String planetType;

    private int radiusKM;
    private int massKG;
    private int orbitDays;
    //List of moons
    //@OneToMany
    //@JoinColumn(name = "moon_id")
    //private Moon moon;
}