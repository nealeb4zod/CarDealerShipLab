import Components.Engine;
import Components.Seats;
import Components.Wheels;
import Enums.EngineType;
import Enums.UpholsteryType;
import Enums.WheelType;
import People.Customer;
import Vehicles.Car;
import Vehicles.ElectricCar;
import Vehicles.HybridCar;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    Customer customer;
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

        car = new Car(engine, wheels, seats, 10000.00);
        electricCar = new ElectricCar(engine, wheels, seats, 15000.00,99);
        hybridCar = new HybridCar(engine, wheels, seats, 20000.000,false);

        customer= new Customer("Bob", 10000000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", customer.getName());
    }

    @Test
    public void canGetWallet() {
        assertEquals(10000000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void canGetCarCollection() {
        customer.addVehicle(car);
        customer.addVehicle(hybridCar);
        customer.addVehicle(electricCar);
        assertEquals(3, customer.getCarCollection().size());
    }

    @Test
    public void canBuyVehicle() {
        customer.buyVehicle(car);
        assertEquals(9990000.00, customer.getWallet(), 0.01);
        assertTrue(customer.getCarCollection().contains(car));
    }


}
