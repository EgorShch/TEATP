package com.example.TEATP.services;

import com.example.TEATP.models.Place;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceService {
    private List<Place> places = new ArrayList<Place>();
    private int ID = 0;

    public PlaceService() {
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= 3; j++){
                places.add(new Place(++ID, 1, i, j));
            }
        }
        for (int i = 1; i <= 6; i++){
            places.add(new Place(++ID, 2, 1, i));
        }
    }

    public List<Place> listPlaces(){
        return places;
    }

    public Place getPlace(int id){
        return places.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public List<Place> placesByHall(int hallId){
        return places.stream().filter(p -> p.getHallId() == hallId).toList();
    }

    public void savePlace(Place place){
        place.setId(++ID);
        places.add(place);
    }
}
