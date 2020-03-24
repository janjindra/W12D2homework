package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    //instance variables

    //constructor
    public Playground(String name, int rating) {
        super(name, rating);
    }

    //methods
    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() <=15) {
            return true;
        } else {
            return false;
        }
    }

}
