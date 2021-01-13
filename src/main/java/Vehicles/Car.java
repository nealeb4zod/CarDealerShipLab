package Vehicles;

import Components.Engine;
import Components.Seats;
import Components.Wheels;

public class Car extends Vehicle{
    public Car(Engine engine, Wheels wheels, Seats seats) {
        super(engine, wheels, seats);
    }
}
