package ua.lits.java_base.hw7_ZOO;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainZoo {
    public static void main(String[] args) {
//  Створити консольну програму зоопарк.
//  В якій будуть різні види твари птахи, ссавчі,
//  три види працівників годівник, прибиральник, бухгалтер і
//  відвідувач.

//  Коли зоопарк відкривається приходить 4 відвідувачі(для кожного окремий обєкт)
//  вони всі платять за вхід,
//  годівники кормлять тварин.
//  Настає обід приходить ще 2 відвідувачі і платять гроші,
//  годівники кормлять тварин,
//  прибиральники прибирають.
//  Настає вечір
//  відвідувачі виходять,
//  годівники кормлять тварин,
//  прибиральники прибирають,
//  бухгалтер рахує скільки заробили за день.
//  Вартість входу 100 грн.
//  В програмі обовязково використати Інтерфейси, абстрактні класи, енами

        System.out.println("-------");
//        Bird peacock = new Peacock(); /* peacock.print is not working with interface? */
        Peacock peacock = new Peacock();
        Eagle eagle = new Eagle();
        Toucan toucan = new Toucan();

        peacock.print();
        System.out.println("-------");
        eagle.print();
        System.out.println("-------");
        toucan.print();
        System.out.println("-------");

        Mammals hedgehog = new Hedgehog();
        Alpaca alpaca = new Alpaca();
        Wolf wolf = new Wolf();

        hedgehog.print();
        System.out.println("-------");
        alpaca.print();
        System.out.println("-------");
        wolf.print();

        System.out.println("\n--- The ZOO is opening. ---");

        Visitor visitor1 = new Visitor("First visitor", 100);
        visitor1.showVisitorEntranceAndPay();
        Visitor visitor2 = new Visitor("Second visitor", 100);
        visitor2.showVisitorEntranceAndPay();
        Visitor visitor3 = new Visitor("Third visitor", 100);
        visitor3.showVisitorEntranceAndPay();
        Visitor visitor4 = new Visitor("Fourth visitor", 100);
        visitor4.showVisitorEntranceAndPay();

        peacock.feederFeed();
        eagle.feederFeed();
        toucan.feederFeed();
        hedgehog.feederFeed();
        alpaca.feederFeed();
        wolf.feederFeed();

        System.out.println("\n--- It's lunch time. ---");

        Visitor visitor5 = new Visitor("Fifth visitor", 100);
        visitor5.showVisitorEntranceAndPay();
        Visitor visitor6 = new Visitor("Sixth visitor", 100);
        visitor6.showVisitorEntranceAndPay();

        peacock.feederFeed();
        eagle.feederFeed();
        toucan.feederFeed();
        hedgehog.feederFeed();
        alpaca.feederFeed();
        wolf.feederFeed();

        Employees cleaner = new Employees("Cleaner", Action.CLEANING);
        cleaner.doSomething();

        System.out.println("\n--- The ZOO is closing");

        visitor1.showVisitorLeaving();
        visitor2.showVisitorLeaving();
        visitor3.showVisitorLeaving();
        visitor4.showVisitorLeaving();
        visitor5.showVisitorLeaving();
        visitor6.showVisitorLeaving();

        peacock.feederFeed();
        eagle.feederFeed();
        toucan.feederFeed();
        hedgehog.feederFeed();
        alpaca.feederFeed();
        wolf.feederFeed();
        cleaner.doSomething();
        Employees accountant = new Employees("Accountant", Action.COUNTING);
        accountant.doSomething();
        accountant.income();

        System.out.println("\n***********************");

        Scanner foodType = new Scanner(System.in);
        boolean exit = false;

        Feeding feeding = new Feeding();

        while (!exit) {
            System.out.println("Please choose food type:" +
                    "\n1 " + FoodType.carnivorous +
                    "\n2 " + FoodType.omnivorous +
                    "\n3 " + FoodType.herbivores +
                    "\n0 exit");
            int food = foodType.nextInt();
            switch (food) {
                case 1:
                    System.out.println("You choose " + FoodType.carnivorous + " food type");
                    feeding.giveFood(FoodType.carnivorous);
                    break;
                case 2:
                    System.out.println("You choose " + FoodType.omnivorous + " food type");
                    feeding.giveFood(FoodType.omnivorous);
                    break;
                case 3:
                    System.out.println("You choose " + FoodType.herbivores + " food type");
                    feeding.giveFood(FoodType.herbivores);
                    break;
                case 0:
                    System.out.println("Bye!");
                    exit = true;
                    break;

            }

        }




//        System.out.println("Please enter No of food for animal you want to feed:" +
//                "\n11 meat for Alpaca" +
//                "\n12 meat for Wolf +" +
//                "\n13 meat for Hedgehog +" +
//                "\n14 meat for Peacock +" +
//                "\n15 meat for Toucan" +
//                "\n16 meat for Eagle +" +
//                "\n21 mix food for Alpaca" +
//                "\n22 mix food for Wolf" +
//                "\n23 mix food for Hedgehog +" +
//                "\n24 mix food for Peacock +" +
//                "\n25 mix food for Toucan" +
//                "\n26 mix food for Eagle" +
//                "\n31 plants for Alpaca +" +
//                "\n32 plants for Wolf" +
//                "\n33 plants for Hedgehog +" +
//                "\n34 plants for Peacock +" +
//                "\n35 plants for Toucan +" +
//                "\n36 plants for Eagle");
//
//        try {
//            Scanner feedingAnimals = new Scanner(System.in);
//            int foodAnimal = feedingAnimals.nextInt();
//            ArrayList<Integer> list = new ArrayList<>(List.of(12,13,14,16,23,24,31,33,34,35));
//                if (list.contains(foodAnimal)) {
//                    throw new Exception("Hurray! Now animal is not hungry!");
//                }
//                else {
//                    throw new Exception("This animal is not eating such a food or you insert wrong number!");
//                }
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
