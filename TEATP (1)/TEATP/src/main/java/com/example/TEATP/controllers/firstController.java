package com.example.TEATP.controllers;

import com.example.TEATP.models.Place;
import com.example.TEATP.models.Seance;
import com.example.TEATP.models.Ticket;
import com.example.TEATP.services.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class firstController {

    private final SeanceService seanceService;
    private final FilmService filmService;
    private final HallService hallService;
    private final PlaceService placeService;
    private final TicketService ticketService;

    @GetMapping("/")
    public String seances(Model model){
        model.addAttribute("sessions", seanceService.listSessions());
        model.addAttribute("films", filmService);
        return "products";
    }

    @GetMapping("/films")
    public String films(Model model){
        model.addAttribute("films", filmService.listFilms());
        return "films";
    }

    @GetMapping("/film/{id}")
    public String film(@PathVariable int id, Model model){
        model.addAttribute("film", filmService.getFilm(id));
        return "film";
    }

    @GetMapping("/sessions/{id}")
    public String seance(@PathVariable int id, Model model){
        Seance seance = seanceService.getSeance(id);
        model.addAttribute("seance", seance);
        model.addAttribute("film", filmService.getFilm(seance.getFilmId()));
        return "seance";
    }

    @GetMapping("/hall/{id}")
    public String hall(@PathVariable int id, Model model){
        model.addAttribute("places", placeService.placesByHall(id));
        model.addAttribute("tickets", ticketService.getTicketsId());
        model.addAttribute("seance", seanceService.getSeance(id));
        return "hall";
    }

    @PostMapping("/createTicket")
    public String createTicket(HttpServletRequest request, @RequestParam("seanceId") int seanceId, @RequestParam("selectedValue") int placeId, @RequestParam("seanceDate") String seanceDate){
        Ticket ticket = new Ticket(0, seanceId, placeId, seanceDate);
        ticketService.saveTicket(ticket);
        return "redirect:/";
    }
}
