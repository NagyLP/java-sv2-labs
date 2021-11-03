package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok:\n");
        for (Flight item : flights) {
            if (item.getStatus() == Status.DELETED) {
                sb.append(" "+item.getFlightNumber() + "\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Flight flight1 = new Flight("B-2351", Status.DELETED);
        Flight flight2 = new Flight("N-312561", Status.DELETED);
        Flight flight3 = new Flight("S-35", Status.DELETED);
        Flight flight4 = new Flight("TU-53", Status.ACTIVE);

        Airport ferihegy1 = new Airport();
        ferihegy1.addFlight(flight1);
        ferihegy1.addFlight(flight2);
        ferihegy1.addFlight(flight3);
        ferihegy1.addFlight(flight4);

        System.out.println(ferihegy1.getDeletedFlights());
    }
}
