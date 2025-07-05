/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passengersource;

import java.util.Random;

public class PassengerSource {
    private Company company;
    private final String sourceName;
    private final Random random;

    public PassengerSource(Company company, String sourceName) {
        this.company = company;
        this.sourceName = sourceName;
        this.random = new Random();
    }

    public boolean requestPickup() {
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        Passenger passenger = new Passenger(pickup, destination, sourceName);
        return company.scheduleVehicle(passenger, pickup, destination);
    }
}




