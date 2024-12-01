package org.example.make_my_trip.service;

import io.netty.util.internal.StringUtil;
import org.example.make_my_trip.model.Passenger;
import org.example.make_my_trip.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MakeMyTripService {

    @Value("${irctc.book.ticket}")
    public  String IRCTC_API;
    @Value("${irctc.get.ticket}")
    public  String TICKETID_URL;
  /*  @Autowired
    RestTemplate restTemplate;*/

 /*   public Ticket makeMyTrip(Passenger passenger) {
        System.out.println(passenger);
        ResponseEntity<Ticket> ticketResponseEntity = restTemplate.postForEntity(IRCTC_API, passenger, Ticket.class);
        if (ticketResponseEntity.getStatusCode().is2xxSuccessful()) {
            return ticketResponseEntity.getBody();
        }
        return null;
    }

    public Ticket getTicket(String ticket) {
        System.out.println("***************get ticket Id of Service  method of ************ "+ticket);
        ResponseEntity<Ticket> t = restTemplate.getForEntity(TICKETID, Ticket.class, ticket);
        if (t.getStatusCode().is2xxSuccessful()) {
            return t.getBody();
        }
        return null;
    }*/

    public Ticket getTicket(String ticket) {
        WebClient webClient =WebClient.create();

        Ticket t = webClient.get()
                .uri(TICKETID_URL, ticket)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Ticket.class)
                .block();

        if(!StringUtil.isNullOrEmpty(ticket)) {
            return t;
        }
        return null;
    }

    public Ticket makeMyTrip(Passenger passenger) {
        WebClient webClient =WebClient.create();
        Ticket block = webClient.post()
                .uri(IRCTC_API)
                .body(BodyInserters.fromValue(passenger))
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Ticket.class)
                .block();

        if(block != null){
            return block;
        }
        return null;

    }


}


/*	93516  */