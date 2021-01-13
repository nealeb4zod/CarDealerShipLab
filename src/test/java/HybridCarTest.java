import Components.Engine;
import Components.Seats;
import Components.Wheels;
import Enums.EngineType;
import Enums.UpholsteryType;
import Enums.WheelType;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class HybridCarTest {

    HybridCar hybridCar;

    Engine engine;
    Wheels wheels;
    Seats seats;

    @Before
    public void before() {
        engine = new Engine(20, EngineType.HYBRID);
        wheels =  new Wheels(4, WheelType.ALLOY);
        seats = new Seats(5, UpholsteryType.SYNTHETIC);

        hybridCar = new HybridCar(engine, wheels, seats, 20000.00,true);
    }

    @Test
    public void doesHasCupHolders() {
        assertTrue(hybridCar.hasCupHolders());
    }

}
