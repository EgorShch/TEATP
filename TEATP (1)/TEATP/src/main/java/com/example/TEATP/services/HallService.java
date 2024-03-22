package com.example.TEATP.services;

import com.example.TEATP.models.Hall;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HallService {
    private List<Hall> halls = new ArrayList<Hall>();
    private int ID = 0;

    public HallService() {
        halls.add(new Hall(++ID, "Чёрный"));
        halls.add(new Hall(++ID, "Красный"));
    }

    public List<Hall> listHalls(){
        return halls;
    }

    public Hall getHall(int id){
        return halls.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void saveHall(Hall hall){
        hall.setId(++ID);
        halls.add(hall);
    }
}
