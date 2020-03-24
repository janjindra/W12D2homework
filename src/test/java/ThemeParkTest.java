import attractions.Attraction;
import attractions.Playground;
import behaviours.IReviewed;
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
        IReviewed iceCreamStall = new IceCreamStall("Ice cream","Peter",4, ParkingSpot.A4);
        themePark.addToAllReviewed(iceCreamStall);
        assertEquals(1,themePark.getAllReviewed().size());
        assertEquals(4,themePark.getAllReviewed().get(0).getRating());

    }

    @Test
    public void canVisit(){
        Attraction KidsPlayground = new Playground("Kids Playground",4);
        Visitor John = new Visitor(22, 188, 30);
        themePark.visit(John,KidsPlayground);
        assertEquals(1,John.getAttractions().size());
        assertEquals(1,KidsPlayground.getVisitCount());
    }

    @Test
    public void canAddToReviewList(){
        IReviewed kidsPlayground = new Playground("Kids Playground",4);
        IReviewed iceCreamStall = new IceCreamStall("Ice cream","Peter",2, ParkingSpot.A4);
        themePark.addToReviewList(kidsPlayground);
        themePark.addToReviewList(iceCreamStall);
        assertEquals(2,themePark.getReviewList().size());
        assertEquals(4,themePark.getReviewList().values().toArray()[0]);
    }

}
