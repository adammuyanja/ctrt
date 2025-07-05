/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passengersource;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Vehicle> vehicles;

    public Company() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean scheduleVehicle(Passenger p, Location pickup, Location destination) {
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                v.setAvailable(false);
                System.out.println("---- PASSENGER REQUEST ----");
                System.out.println("Passenger ID: P" + p.getPassengerId());
                System.out.println("Source: " + p.getSourceName());
                System.out.println("Pickup Location: (" + p.getPickup().getX() + "," + p.getPickup().getY() + ")");
                System.out.println("Destination: (" + p.getDestination().getX() + "," + p.getDestination().getY() + ")");
                System.out.println("Vehicle Assigned: " + v.getSeatCapacity() + "-seater\n");
                return true;
            }
        }
        System.out.println("No available vehicles. Request from " + p.getSourceName() + " lost.\n");
        return false;
    }
}




