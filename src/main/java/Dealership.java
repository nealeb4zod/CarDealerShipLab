import Behaviours.IBuyVehicle;
import Vehicles.Car;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuyVehicle {

    private double till;
    private ArrayList<Vehicle> carCollection;

    public Dealership(double till) {
        this.till = till;
        this.carCollection = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getCarCollection() {
        return carCollection;
    }

    public void addVehicle(Vehicle vehicle) {
        carCollection.add(vehicle);
    }

    @Override
    public void buyVehicle(Vehicle vehicle) {
        till -= vehicle.getPrice();
        addVehicle(vehicle);
    }
}
