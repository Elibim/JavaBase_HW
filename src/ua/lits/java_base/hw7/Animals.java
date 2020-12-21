package ua.lits.java_base.hw7;

abstract class Animals {
    FoodType carnivorous = FoodType.CARNIVOROUS;
    FoodType omnivorous = FoodType.OMNIVOROUS;
    FoodType herbivores = FoodType.HERBIVORES;

    public abstract void eats (FoodType foodType);


}
