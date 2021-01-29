package ua.lits.java_base.hw7_ZOO;

public class Hedgehog extends Mammals {

    @Override
    String sort() {
       return "hedgehog";
    }

    @Override
    int noOfAnimal() {
        return 64;
    }

    @Override
    FoodType foodType() {
        return FoodType.omnivorous;
    }

    @Override
    FeederName feeder() {
        return FeederName.Bob;
    }
}
