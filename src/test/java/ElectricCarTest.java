import Components.Engine;
import Components.Seats;
import Components.Wheels;
import Enums.EngineType;
import Enums.UpholsteryType;
import Enums.WheelType;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    Engine engine;
    Wheels wheels;
    Seats seats;

    @Before
    public void before() {
        engine = new Engine(20, EngineType.ELECTRIC);
        wheels =  new Wheels(4, WheelType.ALLOY);
        seats = new Seats(5, UpholsteryType.SYNTHETIC);

        electricCar = new ElectricCar(engine, wheels, seats, 15000.00,80);
    }

    @Test
    public void canGetChargedPercentage() {
        assertEquals(80, electricCar.getChargedPercentage());
    }
}
