package flights;

public class FlightSegment {
    private String departure;
    private String arrival;

    public FlightSegment(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}
