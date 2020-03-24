import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    //instance variables
    private ArrayList<IReviewed> allReviewed;

    //constructor
    public ThemePark(){
        this.allReviewed = new ArrayList<IReviewed>();
    }

    //methods
    public void addToAllReviewed(IReviewed attractionOrStall) {
         allReviewed.add(attractionOrStall);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount(1);
        visitor.addToAllAttractionsVisited(attraction);
    }
}
