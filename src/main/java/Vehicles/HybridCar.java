package Vehicles;

import Components.Engine;
import Components.Seats;
import Components.Wheels;

public class HybridCar extends Vehicle{

    private boolean cupHolders;

    public HybridCar(Engine engine, Wheels wheels, Seats seats, boolean cupHolders) {
        super(engine, wheels, seats);
        this.cupHolders = cupHolders;
    }

    public boolean hasCupHolders() {
        return cupHolders;
    }
}
