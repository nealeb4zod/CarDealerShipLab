import Components.Engine;
import Enums.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(1.6, EngineType.DIESEL);
    }

    @Test
    public void canGetSize() {
        assertEquals(1.6 , engine.getSize(), 0.01);
    }

    @Test
    public void canGetType() {
        assertEquals(EngineType.DIESEL, engine.getType());
    }
}
