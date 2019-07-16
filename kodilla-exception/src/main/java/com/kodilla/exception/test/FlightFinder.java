package com.kodilla.exception.test;

import javax.management.relation.RoleInfoNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFilght(Flight flight) throws RoleInfoNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Minsk Airport", true);
        airports.put("Paris Charles de Gaulle Airport", true);
        airports.put("Berlin Brandenburg Airport", true);
        airports.put("Rome Ciampino Airport", false);
        airports.put("Warsaw Airport", false);
        boolean result = false;

        if (airports.containsKey(flight.getArrivalAirport())) {
            result = airports.get(flight.getArrivalAirport());
        } else {
            throw new RoleInfoNotFoundException();
        }
        return result;
    }
}
