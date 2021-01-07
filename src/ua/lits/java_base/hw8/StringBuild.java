package ua.lits.java_base.hw8;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder merryChristmas = new StringBuilder("I");
        merryChristmas.append(" ");
        merryChristmas.append("wish");
        merryChristmas.append(" ");
        merryChristmas.append("you");
        merryChristmas.append(" ");
        merryChristmas.append("Merry");
        merryChristmas.append(" ");
        merryChristmas.append("Christmas");
        System.out.println(merryChristmas.toString());

        StringBuilder newYear = new StringBuilder("And");
        newYear.append(" ").append("happy").append(" ").append("New").append(" ").append("Year").append(" ").append("2021").append("!!!");
        System.out.println(newYear.toString());
    }
}
