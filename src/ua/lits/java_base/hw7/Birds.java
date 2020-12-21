package ua.lits.java_base.hw7;

public class Birds extends Animals {
    @Override
    public void eats(FoodType foodType) {
    }


    String [] birds = {"peacock", "eagle", "owl"};






    public FoodType carnivorous = FoodType.CARNIVOROUS;
    public FoodType omnivorous = FoodType.OMNIVOROUS;
    public FoodType herbivores = FoodType.HERBIVORES;







    public String name;
    public int number_of_female;
    public int number_of_male;


    public Birds(String name, int number_of_female, int number_of_male) {
        this.name = name;
        this.number_of_female = number_of_female;
        this.number_of_male = number_of_male;
    }

    public void showBirds() {
        System.out.println("In the ZOO there are " + name + ", " + number_of_female +
                " pcs of female and " + number_of_male + " of male.");
    }




//    @Override
//    public void eats() {
//    }
}
