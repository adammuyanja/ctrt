/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passengersource;

public class MainApp {
    public static void main(String[] args) {
        Company company = new Company();

        company.addVehicle(new Vehicle(4));
        company.addVehicle(new Vehicle(10));

        PassengerSource hotel = new PassengerSource(company, "Hotel Serena");
        PassengerSource corporate = new PassengerSource(company, "Corporate HQ");

        hotel.requestPickup();
        corporate.requestPickup();
        hotel.requestPickup(); // This one may fail (no vehicles left)
    }
}



