package com.example.TEATP.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "Place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "place_id")
    int id;
    @Column(name = "hall_id")
    int hallId;
    @Column(name = "row")
    int row;
    @Column(name = "place")
    int column;
}
