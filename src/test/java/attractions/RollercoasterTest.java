package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void testIsAllowedTo() {
        Visitor visitor1 = new Visitor(11,130,33);
        Visitor visitor2 = new Visitor(11,155,33);
        Visitor visitor3 = new Visitor(13,130,33);
        Visitor visitor4 = new Visitor(13,166,33);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(8.40,rollerCoaster.defaultPrice(), 0.01);
    }
    @Test
    public void getPriceFor(){
        Visitor visitor1 = new Visitor(22, 199, 60);
        Visitor visitor2 = new Visitor(22, 201, 60);
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.01);
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }

}
