import Components.Wheels;
import Enums.WheelType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelsTest {

    Wheels wheels;

    @Before
    public void before() {
        wheels = new Wheels(4, WheelType.ALLOY);
    }

    @Test
    public void canGetNumberOf() {
        assertEquals(4, wheels.getNumberOf());
    }

    @Test
    public void canGetWheelType() {
        assertEquals(WheelType.ALLOY, wheels.getType());
    }
}
