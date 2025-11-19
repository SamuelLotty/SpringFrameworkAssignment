package org.example.springframeworkassignment.daos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class Moon{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="moon_id")
    private int moonId;

    @Column(nullable=false, unique=true)
    private String moonName;
    private int diamaterKM;
    private int orbitalDays;
    private int planetId;
}