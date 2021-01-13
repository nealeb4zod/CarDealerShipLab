import Components.Engine;
import Components.Seats;
import Components.Wheels;
import Enums.EngineType;
import Enums.UpholsteryType;
import Enums.WheelType;
import Vehicles.Car;
import Vehicles.ElectricCar;
import Vehicles.HybridCar;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealershipTest {

    Dealership dealership;
    Car car;
    ElectricCar electricCar;
    HybridCar hybridCar;
    Engine engine;
    Wheels wheels;
    Seats seats;
    ArrayList<Vehicle> carCollection;


    @Before
    public void before() {

        engine = new Engine(1.6, EngineType.DIESEL);
        wheels = new Wheels(4, WheelType.ALLOY);
        seats = new Seats(5, UpholsteryType.LEATHER);

        car = new Car(engine, wheels, seats,10000.00);
        electricCar = new ElectricCar(engine, wheels, seats, 15000.00,99);
        hybridCar = new HybridCar(engine, wheels, seats, 20000.00,false);

        dealership = new Dealership(200000000.00);
    }

    @Test
    public void canGetTill() {
        assertEquals(200000000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canGetCarCollection() {
        dealership.addVehicle(car);
        dealership.addVehicle(hybridCar);
        dealership.addVehicle(electricCar);
        assertEquals(3, dealership.getCarCollection().size());
    }

    @Test
    public void canBuyVehicle() {
        dealership.buyVehicle(car);
        assertEquals(199990000.00, dealership.getTill(), 0.01);
        assertTrue(dealership.getCarCollection().contains(car));
    }




}
