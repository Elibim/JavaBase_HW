package ua.lits.java_base.hw1;

public class HW1 {
    public static void main (String[] args) {
        System.out.println("1st part of homework 1 (check)");
        // Запрограмувати наступні формули:
        double a = 3, b = 4, c = 5;

        // a+b-c*b;
        double result1 = (a + b - c * b);
        System.out.println(result1);

        //(a+1)(c-1)/b+c
        double result2 = ((a + 1) * (c - 1) / b + c);
        System.out.println(result2);

        //b+c+1*a/b+1
        double result3 = (b + c + 1 * a / b + 1);
        System.out.println(result3);

        //a-12+b*2-c+1
        double result4 = (a - 12 + b * 2 - c + 1);
        System.out.println(result4);

        System.out.println();
        System.out.println("2nd part of homework 1");
        //Вивести в консоль наступне:

        //2+2*2 = 6
        System.out.println("2+2*2 = 6");

        //(2+2)2 = 8
        System.out.println("(2+2)2 = 8");

        //10 - 2 * 2 = 6
        System.out.println("10 - 2 * 2 = 6");

        //12+12-4*2 = 16
        System.out.println("12+12-4*2 = 16");

        System.out.println();
        System.out.println("3rd part of homework 1");
        //Вивести в консоль 23, 87, 101 і 11 елементи таблиці юнікоду

        char d1 = 23, d2 = 87, d3 = 101, d4 = 11;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        System.out.println("or");
        System.out.print(d1 +", "+d2 +", "+d3 +" i "+d4 +".");

    }
}
