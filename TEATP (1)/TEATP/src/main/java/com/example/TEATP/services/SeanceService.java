package com.example.TEATP.services;

import com.example.TEATP.models.Seance;
import com.example.TEATP.repositories.SeanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SeanceService {

    private final SeanceRepository seanceRepository;

    public List<Seance> listSessions(){
        return seanceRepository.findAll();
    }

    public Seance getSeance(long id){
        return seanceRepository.findById(id).orElse(null);
    }

    public void saveSeance(Seance seance){
        seanceRepository.save(seance);
    }

    public void deleteSeance(long id){
        seanceRepository.deleteById(id);
    }

}
