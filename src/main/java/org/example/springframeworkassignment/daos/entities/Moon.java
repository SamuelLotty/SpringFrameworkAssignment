package org.example.springframeworkassignment.daos.entities;

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

    @Column(nullable=false, unique=true)
    private String moonName;
    private int diamaterKM;
    private int orbitalDays;

    @ManyToOne
    @JoinColumn(name = "planet_id")
    private Planet planet;
}