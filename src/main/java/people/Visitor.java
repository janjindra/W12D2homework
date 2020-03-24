package people;

import attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> allAttractionsVisited;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.allAttractionsVisited = new ArrayList<Attraction>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Attraction> getAttractions(){
        return allAttractionsVisited;
    }

    public void addToAllAttractionsVisited(Attraction attraction){
        allAttractionsVisited.add(attraction);
    }
}
