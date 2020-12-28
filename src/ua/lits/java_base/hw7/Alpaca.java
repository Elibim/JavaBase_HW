package ua.lits.java_base.hw7;

public class Alpaca extends Mammals {

    @Override
    String sort() {
        return "alpaca";
    }

    @Override
    int noOfAnimal() {
        return 24;
    }

    @Override
    FoodType foodType() {
        return FoodType.herbivores;
    }

    @Override
    FeederName feeder() {
        return FeederName.Bob;
    }
}
