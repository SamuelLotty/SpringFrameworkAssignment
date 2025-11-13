package org.example.springframeworkassignment.daos.entities;

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

}