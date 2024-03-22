package com.example.TEATP.services;

import com.example.TEATP.models.Film;
import com.example.TEATP.models.Seance;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FilmService {
    private List<Film> films = new ArrayList<Film>();
    public int ID = 0;
    FilmService(){
        films.add(new Film(++ID, "King Lion", "John Maritin", "20.03.2024","Multik", "Cool",  93, 0));
        films.add(new Film(++ID, "It", "Chen", "17.05.2017","NeMultik", "CoolMb",  112, 18));
        films.add(new Film(++ID, "Another", "One", "17.05.2017","Multik", "CoolMb",  152, 16));
    }

    public List<Film> listFilms(){
        return films;
    }

    public Film getFilm(int id){
        return films.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void saveFilm(Film film){
        film.setId(++ID);
        films.add(film);
    }

    public void deleteFilm(int id){
        films.removeIf(p -> p.getId() == id);
    }
}
