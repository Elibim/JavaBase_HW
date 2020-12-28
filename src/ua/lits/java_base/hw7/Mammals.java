package ua.lits.java_base.hw7;

abstract class Mammals {

    public Action feeding = Action.FEEDING;

    abstract String sort();
    abstract int noOfAnimal();
    abstract FoodType foodType();
    abstract FeederName feeder();

    public void print(){
        System.out.println("In the ZOO there are " + noOfAnimal() + " of " + sort() + "." + "\nThey are " +
                foodType() + "." + "\n" + feeder() + " is " + feeding + " them.");
    }

    public void feederFeed() {
        System.out.println(feeder() + " is " + feeding + " " + sort() + ".");
    }
}