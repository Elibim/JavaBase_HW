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
        }
}
