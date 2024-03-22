package com.example.TEATP.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Film {
    int id;
    String name;
    String producer;
    String date;
    String genre;
    String description;
    int duration;
    int ageRating;
}
