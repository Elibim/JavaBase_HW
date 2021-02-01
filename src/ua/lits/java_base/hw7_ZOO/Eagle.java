package ua.lits.java_base.hw7_ZOO;

public class Eagle implements Bird {

    public Action feeding = Action.FEEDING;

    @Override
    public String sort() {
        return "eagle";
    }

    @Override
    public int noOfAnimal() {
        return 8;
    }

    @Override
    public FoodType food() {
        return FoodType.carnivorous;
    }

    @Override
    public FeederName feeder() {
        return FeederName.Mike;
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
