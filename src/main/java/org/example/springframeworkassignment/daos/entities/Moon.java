package org.example.springframeworkassignment.daos.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="Moon")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moon{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="moon_id")
    private int moonId;

    @Column(name="name",nullable=false, unique=true)
    private String moonName;
    @Column(name ="diameter_km")
    private int diameterKM;
    @Column(name ="orbital_period_days")
    private int orbitalPeriodDays;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "planet_id", nullable = false)
    @ToString.Exclude
    private Planet planet;
}