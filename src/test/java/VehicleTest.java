import Components.Engine;
import Components.Seats;
import Components.Wheels;
import Enums.EngineType;
import Enums.UpholsteryType;
import Enums.WheelType;
import Vehicles.Car;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Engine engine;
    Wheels wheels;
    Seats seats;

    Vehicle vehicle;

    @Before
    public void before() {
        engine = new Engine(1.6, EngineType.DIESEL);
        wheels = new Wheels(4, WheelType.ALLOY);
        seats = new Seats(5, UpholsteryType.LEATHER);

        vehicle = new Vehicle(engine, wheels, seats);
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, vehicle.getEngine());
    }

    @Test
    public void canGetWheels() {
        assertEquals(wheels, vehicle.getWheels());
    }

    @Test
    public void canGetSeats() {
        assertEquals(seats, vehicle.getSeats());
    }

}
