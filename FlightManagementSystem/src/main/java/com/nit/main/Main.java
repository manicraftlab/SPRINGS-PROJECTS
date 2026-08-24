package com.nit.main;

import com.nit.model.Flight;
import com.nit.model.FlightInfo;

public class Main {

    public static void main(String[] args) {

        Flight flight = new Flight(
                101,
                "6E-234",
                "Hyderabad",
                "Delhi",
                "10:30 AM",
                5500.00
        );

        System.out.println("******** Flight Details ********");
        flight.display();

        System.out.println("\n******** Annotation Details ********");

        Class<?> cls = flight.getClass();

        if (cls.isAnnotationPresent(FlightInfo.class)) {

            FlightInfo info = cls.getAnnotation(FlightInfo.class);

            System.out.println("Airline       : " + info.airline());
            System.out.println("Flight Type   : " + info.flightType());
            System.out.println("Terminal      : " + info.terminal());
            System.out.println("Baggage Limit : " + info.baggageLimit() + " kg");
        }
    }
}