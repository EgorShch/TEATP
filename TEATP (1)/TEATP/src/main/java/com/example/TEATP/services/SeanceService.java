package com.example.TEATP.services;

import com.example.TEATP.models.Seance;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeanceService {
    private List<Seance> sessions = new ArrayList<Seance>();
    private int ID = 0;
    SeanceService(){
        sessions.add(new Seance(++ID, 1, "20.03.2024", "19:43", 200, 1));
        sessions.add(new Seance(++ID, 2, "20.03.2024", "20:15", 220, 2));
    }

    public List<Seance> listSessions(){
        return sessions;
    }

    public Seance getSeance(int id){
        return sessions.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void saveSeance(Seance seance){
        seance.setId(++ID);
        sessions.add(seance);
    }

    public void deleteSeance(int id){
        sessions.removeIf(p -> p.getId() == id);
    }

}
