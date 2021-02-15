package ua.lits.java_base.hw7_ZOO;

import java.io.IOException;
import java.util.Scanner;

public class Feeding {
    public void wrongFood() throws IOException {
        System.out.println("This animal is not eating such a food!");
    }
    Alpaca alpaca = new Alpaca();

    public void giveFood(FoodType type) {
        Scanner fT = new Scanner(System.in);
        boolean ex = false;
        while (!ex) {
        System.out.println("Choose animal you want to feed:" +
                "\nA alpaca" +
                "\nB ..." +
                "\nC ..." +
                "\nZ exit from this menu");
        String f = fT.nextLine();
        switch (f) {
            case "A":
//                try {
//                    type.equals(alpaca.foodType());
//                    System.out.println("Hooray!!! Now " + alpaca.sort() + " is not hungry!");
//                } catch (Exception e) {
//                    System.out.println("This animal is not eating such a food!");
//                }

              if (type.equals(alpaca.foodType())) {
              System.out.println("Hooray!!! Now " + alpaca.sort() + " is not hungry!");
              } else {
                  System.out.println("This animal is not eating such a food!");
              }
                break;
            case "B":
                System.out.println("...");
                break;
            case "C":
                System.out.println("..");
                break;
            case "Z":
                System.out.println("back to first menu");
                ex = true;
                break;
        }
        }
    }
}
