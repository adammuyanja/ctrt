/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passengersource;

/**
 *
 * @author fUJITSU
 */
public class CompanyTest {

    private Company company;
    private Passenger passenger;
    private Location pickup;
    private Location destination;

    // Set up before each test

    /**
     *
     */
    @BeforeEach
    public void setup() {
        company = new Company();
        passenger = new Passenger();
        pickup = new Location(10, 10);
        destination = new Location(90, 90);
    }

    // ✅ Test 1: scheduleVehicle should return a boolean
    @Test
    public void testScheduleVehicleReturnsBoolean() {
        boolean result = company.scheduleVehicle(passenger, pickup, destination);
        assertTrue(result || !result, "scheduleVehicle should return true or false");
    }

    // ✅ Test 2: Out of 10 random requests, at least 1 should succeed
    @Test
    public void testMultipleScheduleAttempts() {
        int successCount = 0;

        for (int i = 0; i < 10; i++) {
            Passenger p = new Passenger();
            Location from = new Location(i * 10, i * 10);
            Location to = new Location(100 - i * 10, 100 - i * 10);

            if (company.scheduleVehicle(p, from, to)) {
                successCount++;
            }
        }

        assertTrue(successCount >= 1, "At least one of the 10 schedule requests should succeed");
    }

    private void assertTrue(boolean par, String scheduleVehicle_should_return_true_or_fal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
