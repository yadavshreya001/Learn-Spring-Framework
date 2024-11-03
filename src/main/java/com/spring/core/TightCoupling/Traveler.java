package com.spring.core.TightCoupling;

public class Traveler {

    Car car = null;

    public Traveler(){
        this.car = new Car();
    }

    public void startJourney(){
        this.car.move();
    }
}






