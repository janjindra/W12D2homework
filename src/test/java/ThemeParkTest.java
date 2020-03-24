import attractions.Attraction;
import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){
        themePark = new ThemePark();
    }

    @Test
    public void canAddToAllReviewed(){
        Stall iceCreamStall = new IceCreamStall("Ice cream","Peter",4, ParkingSpot.A4);
        themePark.addToAllReviewed(iceCreamStall);
        assertEquals(1,themePark.getAllReviewed().size());
    }

    @Test
    public void canVisit(){
        Attraction KidsPlayground = new Playground("Kids Playground",4);
        Visitor John = new Visitor(22, 188, 30);
        themePark.visit(John,KidsPlayground);
        assertEquals(1,John.getAttractions().size());
        assertEquals(1,KidsPlayground.getVisitCount());
    }

}
