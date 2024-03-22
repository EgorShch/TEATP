package com.example.TEATP.services;

import com.example.TEATP.models.Place;
import com.example.TEATP.repositories.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceService {
    private final PlaceRepository placeRepository;

    public List<Place> listPlaces(){
        return placeRepository.findAll();
    }

    public Place getPlace(long id){
        return placeRepository.findById(id).orElse(null);
    }

    public List<Place> placesByHall(int hallId){
        return placeRepository.findAll().stream().filter(p -> p.getHallId() == hallId).toList();
    }

    public void savePlace(Place place){
        placeRepository.save(place);
    }
}
