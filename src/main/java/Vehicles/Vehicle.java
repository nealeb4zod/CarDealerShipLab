package Vehicles;

import Components.Engine;
import Components.Seats;
import Components.Wheels;

public class Vehicle {

    private Engine engine;
    private Wheels wheels;
    private Seats seats;
    private double price;

    public Vehicle(Engine engine, Wheels wheels, Seats seats, double price) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.price = price;
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

    public double getPrice() {
        return price;
    }
}
