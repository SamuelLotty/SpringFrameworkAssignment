package org.example.springframeworkassignment.daos.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="Planet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="planet_id")
    private int planetID;

    @Column(nullable=false, unique=true)
    private String planetName;

    private String planetType;

    private int radiusKM;
    private int massKG;
    private int orbitDay;

    @OneToMany(mappedBy = "planet", cascade=CascadeType.ALL)
    private List<Moon> moon;
}