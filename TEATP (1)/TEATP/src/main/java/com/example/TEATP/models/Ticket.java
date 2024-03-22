package com.example.TEATP.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticket_id")
    int id;
    @Column(name = "seance_id")
    int seanceId;
    @Column(name = "place_id")
    int placeId;
    @Column(name = "date_of_sale")
    String date;
}
