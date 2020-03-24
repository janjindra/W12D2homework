package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", 5, ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasRating() { assertEquals(5, tobaccoStall.getRating());}

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void testIsAllowedTo(){
    Visitor visitor1 = new Visitor(17,155,34);
    Visitor visitor2 = new Visitor(18,155,34);
    assertEquals(false,tobaccoStall.isAllowedTo(visitor1));
    assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }
}