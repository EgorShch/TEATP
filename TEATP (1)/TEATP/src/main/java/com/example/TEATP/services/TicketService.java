package com.example.TEATP.services;

import com.example.TEATP.models.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
    private List<Ticket> tickets = new ArrayList<>();
    private int ID = 0;
    public TicketService() {
        tickets.add(new Ticket(++ID, 1, 2, "toDay"));
        tickets.add(new Ticket(++ID, 1, 5, "toDay"));
    }

    public List<Ticket> listTickets(){
        return tickets;
    }

    public Ticket getTicket(int id){
        return tickets.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void saveTicket(Ticket ticket){
        ticket.setId(++ID);
        tickets.add(ticket);
    }

    public List<Integer> getTicketsId(){
        List<Integer> list = new ArrayList<>();
        for (Ticket ticket: tickets){
            list.add(ticket.getPlaceId());
        }
        return list;
    }

}
