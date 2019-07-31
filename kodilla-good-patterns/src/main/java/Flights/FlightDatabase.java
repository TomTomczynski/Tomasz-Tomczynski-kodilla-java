package Flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightDatabase {

    final private HashMap<String, ArrayList> flightDatabase = new HashMap<>();
    final private ArrayList<String> flights = new ArrayList<>();

    public void addConnection(String airport, String connectionTo) {

        if (flightDatabase.containsKey(airport)) {
            flightDatabase.entrySet().stream()
                    .filter(stringArrayListEntry -> stringArrayListEntry.getKey().equals(airport))
                    .map(Map.Entry::getValue)
                    .forEach(arrayList -> arrayList.add(connectionTo));

        } else {
            ArrayList<String> connection = new ArrayList<>();
            connection.add(connectionTo);
            flightDatabase.put(airport, connection);
        }
    }

    public ArrayList<String> flighFrom(String airport) {
        return flightDatabase.get(airport);
    }

    public ArrayList<String> flighTo(String airport) {
        flights.clear();
        flightDatabase.entrySet().stream()
                .filter(f -> airport != f.getKey())
                .forEach(f -> {
                    if (f.getValue().contains(airport))
                        flights.add(f.getKey());
                });
        return flights;
    }

    public ArrayList<String> flayFromTo(String airport, String destination) {
        flights.clear();
        flightDatabase.entrySet().stream()
                .forEach(f -> {
                    if (f.getKey().equals(airport) && f.getValue().contains(destination))
                        flights.add(airport + " --> " + destination);
                });
        if (flights.isEmpty()) {
            System.out.println("I have not found a direct flight from " + airport + " to " + destination);
            flightDatabase.entrySet().stream()
                    .filter(f -> f.getKey().equals(airport))
                    .flatMap(m -> m.getValue().stream())
                    .forEach(a -> {
                        flightDatabase.entrySet()
                                .stream()
                                .forEach(f ->
                                {
                                    if (f.getKey().equals(a) && f.getValue().contains(destination))
                                        flights.add(airport + " --> " + a + " --> " + destination);
                                });
                    });
        }
        return flights;
    }

    public HashMap<String, ArrayList> getFlightDatabase() {
        return flightDatabase;
    }
}