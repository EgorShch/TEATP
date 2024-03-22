package com.example.TEATP.services;

import com.example.TEATP.models.Ticket;
import com.example.TEATP.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public List<Ticket> listTickets(){
        return ticketRepository.findAll();
    }

    public Ticket getTicket(long id){
        return ticketRepository.findById(id).orElse(null);
    }

    public void saveTicket(Ticket ticket){
        ticketRepository.save(ticket);
    }

    public List<Integer> getTicketsId(){
        List<Integer> list = new ArrayList<>();
        for (Ticket ticket: ticketRepository.findAll()){
            list.add(ticket.getPlaceId());
        }
        return list;
    }

}
