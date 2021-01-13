import Components.Seats;
import Enums.UpholsteryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatsTest {

    Seats seats;

    @Before
    public void setUp(){
        seats = new Seats(4, UpholsteryType.VELOUR);
    }

    @Test
    public void canGetNumberOf(){
        assertEquals(4, seats.getNumberOf());
    }

    @Test
    public void canGetType(){
        assertEquals(UpholsteryType.VELOUR, seats.getType());
    }
}
