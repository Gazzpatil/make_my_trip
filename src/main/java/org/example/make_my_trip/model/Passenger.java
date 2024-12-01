package org.example.make_my_trip.model;

import lombok.Data;


@Data
public class Passenger {
    private String firstName;
    private String lastName;
    private int age;
    private String from;
    private String to;
    private String email;
    private String trainNumber;

}
