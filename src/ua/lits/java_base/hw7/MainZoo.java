package ua.lits.java_base.hw7;

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

        Birds peacock = new Birds("peacocks", 14, 9);
        peacock.showBirds();
        Birds eagle = new Birds("eagles", 4, 4);
        eagle.showBirds();
        Birds owl = new Birds("owls", 6, 4);
        owl.showBirds();
        Mammals lion = new Mammals("lions", 5, 2);
        lion.showMammals();
        Mammals kangaroo = new Mammals("kangaroos", 18, 19);
        kangaroo.showMammals();
        Mammals camel = new Mammals("camels", 3, 2);
        camel.showMammals();

        System.out.println("\n--- The ZOO is opening. ---");

        Visitors visitor1 = new Visitors("First visitor", 100);
        visitor1.showVisitorEnteranceAndPay();
        Visitors visitor2 = new Visitors("Second visitor", 100);
        visitor2.showVisitorEnteranceAndPay();
        Visitors visitor3 = new Visitors("Third visitor", 100);
        visitor3.showVisitorEnteranceAndPay();
        Visitors visitor4 = new Visitors("Fourth visitor", 100);
        visitor4.showVisitorEnteranceAndPay();

        System.out.println("\n--- It's lunch time. ---");

        Visitors visitor5 = new Visitors("Fifth visitor", 100);
        visitor5.showVisitorEnteranceAndPay();
        Visitors visitor6 = new Visitors("Sixth visitor", 100);
        visitor6.showVisitorEnteranceAndPay();

        System.out.println("\n--- The ZOO is closing");

        visitor1.showVisitorLeaving();
        visitor2.showVisitorLeaving();
        visitor3.showVisitorLeaving();
        visitor4.showVisitorLeaving();
        visitor5.showVisitorLeaving();
        visitor6.showVisitorLeaving();
    }
}
