package org.example.make_my_trip.controller;


import org.example.make_my_trip.model.Passenger;
import org.example.make_my_trip.model.Ticket;
import org.example.make_my_trip.service.MakeMyTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MakeMyTripController {

    @Autowired
    MakeMyTripService makeMyTripService;

    @RequestMapping("/home")
    public String makeMyTrip() {
        return "index";
    }

    @PostMapping("/bookTicket")
    public String book(Passenger passenger, Model model){
        System.out.println(passenger);
        Ticket ticket = makeMyTripService.makeMyTrip(passenger);
        model.addAttribute("ticket", ticket);
        return "success";
    }

    @RequestMapping("/search")
    public String getTicket(){
        return "ticket";
    }

    @GetMapping("/ticketId")
    public String  searchTicket(@RequestParam("ticketId")  String ticket,Model model){
        System.out.println("Controller Method of searchTicket "+ticket);
        Ticket t = makeMyTripService.getTicket(ticket);
        model.addAttribute("ticket", t);
        return "success";
    }


}
