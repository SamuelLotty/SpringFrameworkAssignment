package org.example.springframeworkassignment.daos.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.jackson.JsonComponent;

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

    @Column(name ="name",nullable=false, unique=true)
    private String planetName;
    @Column(name ="type")
    private String planetType;
    @Column(name = "radius_km")
    private int radiusKM;

    @Column(name = "mass_kg")
    private int massKG;
    @Column(name = "orbital_period_days")
    private int orbitalPeriodDays;

    @OneToMany(mappedBy = "planet", fetch = FetchType.LAZY ,cascade=CascadeType.ALL)
    @ToString.Exclude
    private List<Moon> moon;
}