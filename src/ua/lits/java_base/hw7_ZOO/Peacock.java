package ua.lits.java_base.hw7_ZOO;

public class Peacock implements Bird {

    public Action feeding = Action.FEEDING;

    @Override
    public String sort() {
        return "peacock";
    }

    @Override
    public int noOfAnimal() {
        return 33;
    }

    @Override
    public FoodType food() {
        return FoodType.omnivorous;
    }

    @Override
    public FeederName feeder() {
        return FeederName.Bob;
    }

    public void print(){
        System.out.println("In the ZOO there are " + noOfAnimal() + " of " + sort() + "." + "\nThey are " +
                food() + "." + "\n" + feeder() + " is " + feeding + " them.");
    }

    public void feederFeed() {
        System.out.println(feeder() + " is " + feeding + " " + sort() + ".");
    }

    @Override
    public void willEat() {
        System.out.println("Hurray! " + sort() + " are " + food());
    }
}