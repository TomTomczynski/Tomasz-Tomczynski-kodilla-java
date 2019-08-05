package Flights;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightDatabaseTest {

    @Test
    public void getFlightDatabase() {
        //Given
        FlightDatabase data1 = new FlightDatabase();
        String airport = "Warsaw";
        String airport2 = "Berlin";
        String airport3 = "Moscow";
        String airport4 = "Rome";

        //When

        data1.addConnection(airport, airport3);
        data1.addConnection(airport, airport2);
        data1.addConnection(airport2, airport3);
        HashMap<String, ArrayList> flightDatabase = data1.getFlightDatabase();
        long result = flightDatabase.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(s -> s.equals(airport))
                .count();

        //Then
        Assert.assertEquals(result, 1);
    }

    @Test
    public void flighConnection() {
        //Given
        FlightDatabase data1 = new FlightDatabase();
        ArrayList<String> expetatin = new ArrayList<>();

        String airport = "Warsaw";
        String airport2 = "Berlin";
        String airport3 = "Moscow";
        String airport4 = "Rome";

        data1.addConnection(airport, airport2);
        data1.addConnection(airport, airport3);

        data1.addConnection(airport2, airport);
        data1.addConnection(airport2, airport4);

        data1.addConnection(airport3, airport);
        data1.addConnection(airport3, airport4);

        data1.addConnection(airport4, airport2);
        data1.addConnection(airport4, airport3);

        expetatin.add(airport2);
        expetatin.add(airport3);
        //When
//
//        ArrayList<String> result = data1.flayFromTo(airport, airport4);
//        result.forEach(s -> System.out.println(s));

        ArrayList<String> result1 = data1.flighFrom(airport4);
        ArrayList<String> result2 = data1.flighTo(airport);


        //Then
        Assert.assertEquals(result1, expetatin);
        Assert.assertEquals(result2, expetatin);

    }

}