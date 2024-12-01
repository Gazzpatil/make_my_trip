package org.example.make_my_trip.model;

import lombok.Data;


@Data
public class Ticket {
    private String ticketId;
    private String from;
    private String to;
    private String trainNumber;
    private String ticketPrice;
    private String ticketStatus;
    private String passengerName;
}
