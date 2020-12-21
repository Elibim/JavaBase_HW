package ua.lits.java_base.hw7;

public class Mammals {
    public String name;
    public int number_of_female;
    public int number_of_male;

    public Mammals(String name, int number_of_female, int number_of_male) {
        this.name = name;
        this.number_of_female = number_of_female;
        this.number_of_male = number_of_male;
    }

    public void showMammals() {
        System.out.println("In the ZOO there are " + name + ", " + number_of_female +
                " pcs of female and " + number_of_male + " of male.");
    }
}
