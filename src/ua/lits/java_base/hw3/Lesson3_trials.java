package ua.lits.java_base.hw3;

import java.util.Random;

public class Lesson3_trials {
    public static void main(String[] args) {
//
//        System.out.println("The 'if' statement");
//        int x = 5;
//        int y = 3;
//
//        if (x + y == 8) {
//            System.out.println("1_true");
//        }
//
//        if (x + y == 2) {
//            System.out.println("2_true");
//        }
//
//        if (x != 2) {
//            System.out.println("3_false");
//        }
//
//
//        System.out.println("");
//        System.out.println("The 'else' statement");
//
//        int results1_norm1 = 28;
//        if (results1_norm1 != 28) {
//            System.out.println("1 Out of norm!");
//        } else {
//            System.out.println("1 Good");
//        }
//
//        int results2_norm1 = 21;
//        if (results2_norm1 == 21) {
//            System.out.println("2 Good");
//        } else {
//            System.out.println("2 Out of norm!");
//        }
//
//       // int results3_norm1 = 21;
//       // string result = (results3_norm1 == 10) ? "3 Good" : "3 Out of norm!";
//       // System.out.println(result);
//
//        System.out.println("");
//        System.out.println("The 'else if' statement");
//
//        int lvl1 = 99;
//        if (lvl1 == 100) {
//
//            System.out.println("OK");
//        }
//        else if (lvl1 < 100) {
//            System.out.println("1 To low!");
//        }
//        else if (lvl1 == 101) {
//            System.out.println("Bit to high!");
//        }
//        else {
//        System.out.println("To high!");
//        }
//
//        int lvl2 = 100;
//        if (lvl2 == 100) {
//
//            System.out.println("2 OK");
//        }
//        else if (lvl2 < 100) {
//            System.out.println("To low!");
//        }
//        else if (lvl2 == 101) {
//            System.out.println("Bit to high!");
//        }
//        else {
//            System.out.println("To high!");
//        }
//
//        int lvl3 = 102;
//        if (lvl3 == 100) {
//
//            System.out.println("OK");
//        }
//        else if (lvl3 < 100) {
//            System.out.println("To low!");
//        }
//        else if (lvl3 == 101 || lvl3 == 102) {
//            System.out.println("3 Bit to high!");
//        }
//        else {
//            System.out.println("4 To high!");
//        }
//
//        int lvl4 = 4441;
//        if (lvl4 == 100) {
//
//            System.out.println("OK");
//        }
//        else if (lvl4 < 100) {
//            System.out.println("To low!");
//        }
//        else if (lvl4 == 101) {
//            System.out.println("Bit to high!");
//        }
//        else {
//            System.out.println("4 To high!");
//        }
//
//        System.out.println("");
//        System.out.println("The 'switch' statement");
//
//        System.out.println("1-pink, 2-red, 3-white, 4-blue, 5-purple");
//
//        int colour1 = 1;
//        switch (colour1) {
//            case 1:
//                System.out.println("Warm colour");
//                break;
//            case 2:
//                System.out.println("Warm colour");
//                break;
//            case 3:
//                System.out.println("Neither warm nor cool colour");
//                break;
//            case 4:
//            case 5:
//                System.out.println("Cool colour");
//                break;
//            default:
//                System.out.println("Don't know that colour.");
//        }
//
//        int colour2 = 2;
//        switch (colour2) {
//            case 1:
//                System.out.println("Warm colour");
//                break;
//            case 2:
//                System.out.println("Warm colour");
//                break;
//            case 3:
//                System.out.println("Neither warm nor cool colour");
//                break;
//            case 4:
//            case 5:
//                System.out.println("Cool colour");
//                break;
//            default:
//                System.out.println("Don't know that colour.");
//        }
//
//        int colour3 = 3;
//        switch (colour3) {
//            case 1:
//                System.out.println("Warm colour");
//                break;
//            case 2:
//                System.out.println("Warm colour");
//                break;
//            case 3:
//                System.out.println("Neither warm nor cool colour");
//                break;
//            case 4:
//            case 5:
//                System.out.println("Cool colour");
//                break;
//            default:
//                System.out.println("Don't know that colour.");
//        }
//
//        int colour4 = 4;
//        switch (colour4) {
//            case 1:
//                System.out.println("Warm colour");
//                break;
//            case 2:
//                System.out.println("Warm colour");
//                break;
//            case 3:
//                System.out.println("Neither warm nor cool colour");
//                break;
//            case 4:
//            case 5:
//                System.out.println("Cool colour");
//                break;
//            default:
//                System.out.println("Don't know that colour.");
//        }
//
//        int colour5 = 5;
//        switch (colour5) {
//            case 1:
//                System.out.println("Warm colour");
//                break;
//            case 2:
//                System.out.println("Warm colour");
//                break;
//            case 3:
//                System.out.println("Neither warm nor cool colour");
//                break;
//            case 4:
//            case 5:
//                System.out.println("Cool colour");
//                break;
//            default:
//                System.out.println("Don't know that colour.");
//        }
//
//        int colour6 = 6;
//        switch (colour6) {
//            case 1:
//                System.out.println("Warm colour");
//                break;
//            case 2:
//                System.out.println("Warm colour");
//                break;
//            case 3:
//                System.out.println("Neither warm nor cool colour");
//                break;
//            case 4:
//            case 5:
//                System.out.println("Cool colour");
//                break;
//            default:
//                System.out.println("Don't know that colour.");
//        }
//        System.out.println("");
//        System.out.println("The 'while' loop");
//
//        System.out.println("try 1");
//        int i = 7;
//        while (i <= 10) {
//                System.out.println(i);
//                i ++;
//        }
//
//        System.out.println("try 2");
//        int d = 2;
//        while (d <= 10) {
//            System.out.println(d);
//            d += 2;
//        }
//
//        System.out.println("try 3");
//        int i1 = 5;
//        while (i1 > 3) {
//            System.out.println(i1);
//            --i1;
//        }
//
//        System.out.println("The 'while' loop");
//
//        int xloop = 4;
//        do {
//            System.out.println(xloop);
//            xloop++;
//        } while (xloop < 7);
//
//        int yloop = 4;
//        do {
//            System.out.println(yloop);
//            ++yloop;
//        }
//        while (yloop < 7);
//
//        System.out.println("compare while (vs. do/while) (pierw sprawdza loop a potem event. wydaje rezultat)");
//
//        System.out.println("a");
//        int aloop = 5;
//        while (aloop < 5) {
//            System.out.println(aloop);
//            aloop++;
//        }
//            // aloop = -
//            // nie bedzie zadnego loop bo pierw sprawdza a potem wydaje rezultat
//
//        System.out.println("b");
//        int bloop = 4;
//        while (bloop < 5) {
//            System.out.println(bloop);
//            bloop++;
//        }
//            // bloop = 4
//            // bedzie jeden loop bo pierw sprawdza a potem wydaje rezultat
//
//        System.out.println("compare do/while (vs. while) (pierw wydaje rezultat a potem sprawdza, kolejnosc 'sout'&++ jest wazna)");
//
//        System.out.println("c");
//        int cloop = 5;
//        do {
//            System.out.println(cloop);
//            cloop++;
//        }
//        while (cloop < 5);
//            // c = 5
//            // bedzie jeden loop bo pierw wydaje rezultat a potem sprawdza, pisze 5 i potem sprawdza ze 5 !< 5 i dalej stop
//
//        System.out.println("d");
//        int dloop = 5;
//        do {
//            dloop++;
//            System.out.println(dloop);
//        }
//        while (dloop < 5);
//              // d = 6
//              // bedzie jeden loop bo pierw wydaje rezultat a potem sprawdza, pisze 5 i potem sprawdza ze 5 !< 5 i dalej stop
//
//        System.out.println("e");
//        int eloop = 4;
//        do {
//            System.out.println(eloop);
//            eloop++;
//        }
//        while (eloop < 5);
//            // e = 4
//            // bedzie jeden loop bo pierw wydaje rezultat a potem sprawdza, pisze 4 i potem sprawdza ze 4 jest ostatnie < 5 i dalej stop
//
//        System.out.println("f");
//        int floop = 4;
//        do {
//            floop++;
//            System.out.println(floop);
//        }
//        while (floop < 5);
//              // f = 5
//              //
//
//        System.out.println("");
//        System.out.println("'brake'");
//        System.out.println("'brake for'");
//
//        for (int b1 = 0; b1 < 10; b1++) {
//            if (b1 == 4) {
//                break;
//            }
//            System.out.println(b1);
//        }
//        System.out.println("'brake while'");
//        int b2 = 0;
//        while (b2 < 10) {
//            System.out.println(b2);
//            b2++;
//            if (b2 == 4) {
//                break;
//            }
//        }
//        System.out.println("");
//        System.out.println("'continue'");
//        System.out.println("'continue for'");
//        for (int c1 = 0; c1 < 10; c1++) {
//            if (c1 == 4) {
//                continue;
//            }
//            System.out.println(c1);
//        }
//        System.out.println("'continue while'");
//        int c2 = 0;
//        while (c2 < 10) {
//            if (c2 == 4) {
//                c2++;
//                continue;
//            }
//            System.out.println(c2);
//            c2++;
//        }
//        System.out.println("");
//        System.out.println("** 'Array'");
//
//        System.out.println("* 1st");
//        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars1[0]);
//            // Outputs Volvo
//
//        System.out.println("* 2nd");
//        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
//        cars2[0] = "Opel";
//        System.out.println(cars2[0]);
//            // Now outputs Opel instead of Volvo
//
//        System.out.println("* 3rd length");
//        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars3.length);
//            // Outputs 4
//
//        System.out.println("* 4th with loop");
//        String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (int i = 0; i < cars4.length; i++) {
//            System.out.println(cars4[i]);
//        }
//            //Volvo, BMW, Ford, Mazda
//
//        System.out.println("* 5th for each");
//        String[] cars5 = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars5) {
//            System.out.println(i);
//        }
//            //Volvo, BMW, Ford, Mazda
//
//        System.out.println("* mulitdimentional array");
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        int x = myNumbers[1][2];
//        System.out.println(x);
//            // Outputs 7
//
//        int[][][] myNumbers2 = { { {1, 2, 3, 4}, {5, 6, 7} }, myNumbers };
//        int x2 = myNumbers2[1][0][1];
//        System.out.println(x2);
//        // Outputs 2




    }


}