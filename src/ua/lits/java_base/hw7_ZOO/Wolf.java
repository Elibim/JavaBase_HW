package ua.lits.java_base.hw7_ZOO;

public class Wolf extends Mammals {

    @Override
    String sort() {
        return "wolf";
    }

    @Override
    int noOfAnimal() {
        return 17;
    }

    @Override
    FoodType foodType() {
        return FoodType.carnivorous;
    }

    @Override
    FeederName feeder() {
        return FeederName.Tom;
    }
}

