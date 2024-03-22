package com.example.TEATP.models;

import lombok.*;

@AllArgsConstructor
@Data
public class Seance {
    int id;
    int hallId;
    String date;
    String time;
    int cost;
    int filmId;
}
