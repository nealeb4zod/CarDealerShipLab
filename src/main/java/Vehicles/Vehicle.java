package Vehicles;

import Components.Engine;
import Components.Seats;
import Components.Wheels;

public class Vehicle {

    private Engine engine;
    private Wheels wheels;
    private Seats seats;

    public Vehicle(Engine engine, Wheels wheels, Seats seats) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Seats getSeats() {
        return seats;
    }
}
