import attractions.Attraction;
import attractions.Playground;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    //instance variables
    private ArrayList<IReviewed> allReviewed;
    private HashMap<String, Integer> reviewList;

    //constructor
    public ThemePark(){
        this.allReviewed = new ArrayList<IReviewed>();
        this.reviewList = new HashMap<String, Integer>();
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

    public void addToReviewList(IReviewed attractionOrStall){
        reviewList.put(attractionOrStall.getName(),attractionOrStall.getRating());

    }

    public HashMap<String, Integer> getReviewList() {
        return reviewList;
    }



//    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor){
//        ArrayList<IReviewed> allAllowedFor = new ArrayList<IReviewed>();
//
//        for (IReviewed reviewed : this.allReviewed) {
//
//            if (reviewed.isAllowedTo(visitor) != true) {
//                //do nothing
//            } else {
//                allAllowedFor.add(reviewed);
//            }
//        }
//        return allAllowedFor;
//    }

}
