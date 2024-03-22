package com.example.TEATP.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "Seance")
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seance_id")
    int id;
    @Column(name = "hall_id")
    int hallId;
    @Column(name = "date")
    String date;
    @Column(name = "time")
    String time;
    @Column(name = "cost")
    int cost;
    @Column(name = "film_id")
    int filmId;
}
