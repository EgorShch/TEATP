package com.example.TEATP.repositories;

import com.example.TEATP.models.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository <Place, Long> {
}
