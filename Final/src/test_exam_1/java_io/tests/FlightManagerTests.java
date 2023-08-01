package test_exam_1.java_io.tests;

import org.junit.jupiter.api.Test;
import test_exam_1.java_io.Flight;
import test_exam_1.java_io.FlightManager;
import test_exam_1.java_io.Mode;

import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static test_exam_1.java_io.Main.getFlights;

public class FlightManagerTests {

    public final FlightManager manager = new FlightManager(getFlights());

    public FlightManagerTests() throws FileNotFoundException {
    }

    @Test
    public void getMostModeTest() {

        assertEquals(Mode.DEPARTURE, manager.getMostMode());

    }

    @Test
    public void getFlightByIdTest() {

        Optional<Flight> flightById = manager.getFlightById("BH2946");

        assertTrue(flightById.isPresent());

        Flight flight = flightById.get();

        assertEquals("BH2946", flight.getId());
        assertEquals(Mode.DEPARTURE, flight.getMode());
        assertEquals("Tunis", flight.getCity());
        assertEquals(LocalTime.parse("09:33"), flight.getTime());

    }

    @Test
    public void getFlightsByCityAndModeTest() {

        List<Flight> flights = manager.getFlightsByCityAndMode("Dublin", Mode.ARRIVAL);

        assertEquals(3, flights.size());

        for (Flight f : flights) {
            assertEquals(Mode.ARRIVAL, f.getMode());
            assertEquals("Dublin", f.getCity());
        }


    }

    @Test
    public void getEarliestFlightTest() {
        Optional<Flight> earliestFlight = manager.getEarliestFlight();

        assertTrue(earliestFlight.isPresent());

        Flight flight = earliestFlight.get();

        assertEquals("JE9763", flight.getId());
        assertEquals(Mode.ARRIVAL, flight.getMode());
        assertEquals("Paris", flight.getCity());
        assertEquals(LocalTime.parse("06:01"), flight.getTime());
    }

    @Test
    public void getFlightsByMode() {
        HashMap<Mode, List<Flight>> flightsByMode = manager.getFlightsByMode();
        List<Flight> arrivalFlights = flightsByMode.get(Mode.ARRIVAL);
        List<Flight> departureFlights = flightsByMode.get(Mode.DEPARTURE);

        assertEquals(46, arrivalFlights.size());
        assertEquals(54, departureFlights.size());

        for (Flight f : arrivalFlights) {
            assertEquals(Mode.ARRIVAL, f.getMode());
        }

        for (Flight f : departureFlights) {
            assertEquals(Mode.DEPARTURE, f.getMode());
        }
    }
}
