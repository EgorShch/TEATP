package com.example.TEATP.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Place {
    int id;
    int hallId;
    int row;
    int column;
}
