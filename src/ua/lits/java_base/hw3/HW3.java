package ua.lits.java_base.hw3;

import java.util.Random;

public class HW3 {

    public static boolean isPalindrom(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
//            System.out.println("char at " + i + " index is: " + c);
            reverse += c;
//            System.out.println(reverse);
            //System.out.println(i.length);
        }
//        System.out.println(reverse);
//        System.out.println(word);
        return reverse.equals(word);
    }

    public static void iWasBorn(int month) {
        switch (month) {
            case 1:
                System.out.println("Я народився в січні.");
                break;
            case 2:
                System.out.println("Я народився в лютому.");
                break;
            case 3:
                System.out.println("Я народився в березні.");
                break;
            case 4:
                System.out.println("Я народився в квітні.");
                break;
            case 5:
                System.out.println("Я народився в травні.");
                break;
            case 6:
                System.out.println("Я народився в червні.");
                break;
            case 7:
                System.out.println("Я народився в липні.");
                break;
            case 8:
                System.out.println("Я народився в серпні.");
                break;
            case 9:
                System.out.println("Я народився в вересні.");
                break;
            case 10:
                System.out.println("Я народився в жовтні.");
                break;
            case 11:
                System.out.println("Я народився в листопаді.");
                break;
            case 12:
                System.out.println("Я народився в грудні.");
                break;
            default:
                System.out.println("Не знаю такого місяця.");
        }
    }

    public static void show(int[] arr, int size) {
        for (int y = 0; y < size; y++) {
            System.out.print(arr[y] + ", ");
        }
    }

    public static void main(String[] args) {

        System.out.println("** 1st part of homework.");

        String test1 = "levels";
        System.out.println(test1);
        boolean result = isPalindrom(test1);
        System.out.println("is Palindrom result: " + result);

        String test2 = "level";
        System.out.println(test2);
        boolean result1 = isPalindrom(test2);
        System.out.println("is Palindrom result1: " + result1);

        System.out.println("");
        System.out.println("** 2nd part of homework.");
                //Створити  масив int[] a = new int[20]; Заповнити його рандомними числам за допомогою
                // Random r = new Random();r.nextInt(47);

        final int size = 20;
        int[] a2 = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            a2[i] = r.nextInt(47);
//            System.out.println("a2[" + i + "] = " + a2[i]);
            System.out.print(a2[i] + ", ");
           }

            System.out.println("\n* 2a)");
//           а. Знайти набільше число
        int max = 0;
        for (int i = 0; i < size; i++) {
//            System.out.println(max + " < " + a2[i]);
            if (max < a2[i]) {
                max = a2[i];
            }
        }
        System.out.println("max: " + max);

        System.out.println("* 2b)");
        //    b. Знайти наменше число
        int min = a2[0];
        for (int i = 0; i < size; i++) {
//            System.out.println(min + " > " + a2[i]);
            if (min > a2[i]) {
                min = a2[i];
            }
        }
        System.out.println("min: " + min);

        System.out.println("* 2c)");
        //    c. Зробити масив в протилежному напрямі
        for (int c1 = size -1; c1 >= 0; c1--) {
            System.out.print(a2[c1] + ", ");
        }

        System.out.println("\n* 2d)");
        //    d. Знайти всі непарні елементи масиву

         for (int d1 = 0; d1 <= size -1; d1++) {
            if (a2[d1] % 2 == 0){
                System.out.print(a2[d1] + ", ");
            }
         }

        System.out.println("\n* 2e)");
        //    e. Відсортувати масив любив відомим мав алгоритмом
        show(a2, size);
        int n = size;
        int swap = 0;
        do {
            for (int t = 0; t < n - 1; t++) {
                if (a2[t] > a2[t +1]) {

                swap = a2[t];
                a2[t] = a2[t + 1];
                a2[t + 1] = swap;
                }
            }
            n = n - 1;
        } while (n >1);
        System.out.println();
        show(a2, size);



        System.out.println("");
        System.out.println("** 3rd part of homework.");

        int[][] a3 = {
                {1, 5, 7, 32, 65, 5, 23, 45, 75, 1},
                {33, 44, 12, 32, 4, 5, 12, 3, 4, 1},
                {99, 2, 4, 21, 35, 67, 86, 32, 2, 4},
                {12, 43, 54, 22, 6, 774, 2, 2, 4, 1},
                {12, 34, 12, 2, 0, 12, 40, 42, 12, 3},
                {55, 34, 52, 61, 71, 863, 46, 87, 34, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {99, 32, 6, 8, 3, 236, 78, 568, 54, 23},
                {1, 3, 5, 7, 9, 11, 12, 13, 15, 17},
        };
        for (int x = 0; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                System.out.print(a3[x][y] + ", ");
            }
            System.out.println();
        }

        System.out.println("* 3a)");
        // а. Вивести всі значення які вище діагоналі
        for (int x = 0; x <= 9 -1; x++) {
            for (int y = x + 1; y <= 9; y++) {
                System.out.print(a3[x][y] + ", ");
            }
            System.out.println();
        }

        System.out.println("* 3b)");
        // b. вивести всі значення які нижче діагоналі
        for (int x = 1; x <= 9; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(a3[x][y] + ", ");
            }
            System.out.println();
        }


            System.out.println("");
            System.out.println("** 4th part of homework.");

            iWasBorn(1);
            iWasBorn(5);

            //Switch реалізувати метод який буде приймати номер місяця і буде виводити "Я народився в Січні" якщо передали 1
            //public void iWasBorn(int month) {
            //
            //}

        }
//1. Написати реалізацію для методу
//Метод має визначати чи слово є паладром чи ні. hint: https://www.javatpoint.com/java-string-to-char


    }
