package com.spring.core.AnnotationBasedConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {

    private Vehicle vehicle;

    @Autowired
    public Traveler(@Qualifier("cycle") Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}


