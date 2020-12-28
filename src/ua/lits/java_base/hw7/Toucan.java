package ua.lits.java_base.hw7;

public class Toucan implements Bird {

    public Action feeding = Action.FEEDING;

    @Override
    public String sort() {
        return "toucan";
    }

    @Override
    public int noOfAnimal() {
        return 11;
    }

    @Override
    public FoodType food() {
        return FoodType.herbivores;
    }

    @Override
    public FeederName feeder() {
        return FeederName.Tom;
    }

    public void print(){
        System.out.println("In the ZOO there are " + noOfAnimal() + " of " + sort() + "." + "\nThey are " +
                food() + "." + "\n" + feeder() + " is " + feeding + " them.");
    }

    public void feederFeed() {
        System.out.println(feeder() + " is " + feeding + " " + sort() + ".");
    }
}

