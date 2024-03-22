package com.example.TEATP.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Ticket {
    int id;
    int seanceId;
    int placeId;
    String date;
}
