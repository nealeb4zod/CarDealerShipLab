package People;

import Behaviours.IBuyVehicle;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuyVehicle {

    private String name;
    private double wallet;
    private ArrayList<Vehicle> carCollection;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.carCollection = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void addVehicle(Vehicle vehicle) {
        carCollection.add(vehicle);
    }

    public ArrayList<Vehicle> getCarCollection() {
        return carCollection;
    }


    public void buyVehicle(Vehicle vehicle) {
        wallet -= vehicle.getPrice();
        addVehicle(vehicle);
    }


}
