package domainModelTest;

import domainModel.Ship;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DomainModelTest extends Assert {

    static Ship ship;

    @BeforeClass
    public static void createShip() {
        ship = new Ship();
    }

    @Test
    public void isShipInit() {
        assertFalse(ship.isEmpty());
    }

    @Test
    public void isShipEmpty() { assertEquals(ship.getPeopleNum(), 3);
    }

}
