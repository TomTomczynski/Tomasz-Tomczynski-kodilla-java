package Flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FlightDatabase {

    final HashMap<String, ArrayList> flightDatabase = new HashMap<>();

    public void addConnection(String airport, String connectionTo) {

        if (flightDatabase.containsKey(airport)) {
            System.out.println("exist");
            flightDatabase.entrySet().stream()
                    .filter(stringArrayListEntry -> stringArrayListEntry.getKey().equals(airport))
                    .map(Map.Entry::getValue)
                    .forEach(arrayList -> arrayList.add(connectionTo));

        } else {
            System.out.println("not exist");
            ArrayList<String> destination = new ArrayList<>();
            destination.add(connectionTo);
            flightDatabase.put(airport,destination);
        }
    }

    public HashMap<String, ArrayList> getFlightDatabase() {
        return flightDatabase;
    }

}