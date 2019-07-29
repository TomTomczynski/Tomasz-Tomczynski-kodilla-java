package Flights;

public class FlightApplication {
    public static void main(String[] args) {
        FlightDatabase data1 = new FlightDatabase();
        data1.addConnection("Warszawa","Moskwa");
        data1.addConnection("Warszawa","Berlin");
        data1.addConnection("Berlin","Warszawa");
        data1.addConnection("Berlin","Praga");

        // Znalezienie wszystkich lotów z podanego miasta

//        System.out.println(data1.getFlightDatabase().entrySet().size());
        data1.getFlightDatabase().entrySet().stream()
                .forEach(stringArrayListEntry -> {
                    System.out.println("Flight from: " + stringArrayListEntry.getKey() + " to: ");

                    stringArrayListEntry.getValue().forEach(o -> System.out.println(o));
                });
    }
}
