package org.example.springframeworkassignment.daos.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class Moon{
    private int moonId;
    private String moonName;
    private int diamaterKM;
    private int orbitalDays;
    @ManyToOne
    @JoinColumn(name = "planet_id")
    private Planet planet;
}