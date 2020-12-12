package ua.lits.java_base.hw5;

public class Main {

    public static void main(String[] args) {

        SpaceX1 spaceX1 = new SpaceX1(new Date(2019, 5, 1), 4,
                 "LEO");
        SpaceX1c spaceX1c = new SpaceX1c(new Date(2019, 9, 1), 4, true,
                 "LEO");
        SpaceX2 spaceX2 = new SpaceX2(new Date(2020, 1, 1), 6,
                 "LEO");
        SpaceX2c spaceX2c = new SpaceX2c(new Date(2020,12,1),6, true,
                 "LEO");
        SpaceX2Mars spaceX2Mars = new SpaceX2Mars(new Date(2021, 11,1), 6, true,
                 "Mars", 10);

        spaceX1.show();
        spaceX1c.show();
        spaceX2.show();
        spaceX2c.show();
        spaceX2Mars.show();


    }
}
