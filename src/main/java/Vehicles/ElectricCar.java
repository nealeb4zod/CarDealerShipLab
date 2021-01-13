package Vehicles;

import Components.Engine;
import Components.Seats;
import Components.Wheels;

public class ElectricCar extends Vehicle{

    private int chargedPercentage;

    public ElectricCar(Engine engine, Wheels wheels, Seats seats, double price, int chargedPercentage) {
        super(engine, wheels, seats, price);
        this.chargedPercentage = chargedPercentage;
    }

    public int getChargedPercentage() {
        return chargedPercentage;
    }
}
