package com.spring.core.LooseCoupling;

public class Client {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();       // Create a vehicle (you could switch this line to Bike or Cycle)
         // Vehicle vehicle = new Bike();
        // Vehicle vehicle = new Cycle();

        Traveler traveler = new Traveler(vehicle);      // Inject vehicle into Traveler
        traveler.startJourney();

    }
}




