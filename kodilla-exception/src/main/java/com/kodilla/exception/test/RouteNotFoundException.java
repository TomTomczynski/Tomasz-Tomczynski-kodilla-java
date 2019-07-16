package com.kodilla.exception.test;

import javax.management.relation.RoleInfoNotFoundException;

public class RouteNotFoundException extends Exception {
    public static void main(String[] args) {
        Flight london = new Flight("Paris Charles de Gaulle Airport", "London Heathrow Airpor");
        Flight minsk = new Flight("Paris Charles de Gaulle Airport", "Minsk Airport");
        Flight warsaw = new Flight("Paris Charles de Gaulle Airport", "Warsaw Airport");

        FlightFinder flightFinder = new FlightFinder();
        try {
            Boolean theAirportIsAvsilsble = flightFinder.findFilght(minsk);
            System.out.println(theAirportIsAvsilsble.toString());
        } catch (RoleInfoNotFoundException e) {
            System.out.println("Airport ont exit in the list");
        }
    }
}
