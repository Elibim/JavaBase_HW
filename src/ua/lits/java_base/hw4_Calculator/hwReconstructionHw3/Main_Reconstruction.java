package ua.lits.java_base.hw4_Calculator.hwReconstructionHw3;

public class Main_Reconstruction {
    public static void main(String[] args) {

      System.out.println("** 1st part of homework.");
        //        System.out.println("** 1st part of homework.");
        //1. Написати реалізацію для методу
        //Метод має визначати чи слово є паладром чи ні. hint: https://www.javatpoint.com/java-string-to-char
        AIsPalindrome aIsPalindrome = new AIsPalindrome();

        String test1 = "levels";
        System.out.println(test1);
        boolean result = aIsPalindrome.isPalindrome(test1);
        System.out.println("is Palindrome result: " + result);

        String test2 = "level";
        System.out.println(test2);
        boolean result1 = aIsPalindrome.isPalindrome(test2);
        System.out.println("is Palindrome result1: " + result1);

        System.out.println("\n** 2nd part of homework.");
        // Створити  масив int[] a = new int[20]; Заповнити його рандомними числам за допомогою
        // Random r = new Random();r.nextInt(47);

        RandomArray randomArray = new RandomArray();
        final int size = 20;
        int[] a2 = randomArray.generateArrayOfSize(size);

        System.out.println("\n* 2a)");
        // а. Знайти набільше число

        int max = randomArray.getMaxValue(a2, size);
        System.out.println("max: " + max);

        System.out.println("* 2b)");
        // b. Знайти наменше число

        int min = randomArray.getMinValue(a2, size);
        System.out.println("min: " + min);

        System.out.println("* 2c)");
        // c. Зробити масив в протилежному напрямі

        randomArray.printOppositeDir(a2, size);

        System.out.println("\n* 2d)");
        // d. Знайти всі непарні елементи масиву

        randomArray.printEven(a2, size);

        System.out.println("\n* 2e)");
        // e. Відсортувати масив любив відомим мав алгоритмом

        randomArray.printSorted(a2, size);

      System.out.println("\n ");
        System.out.println("** 3rd part of homework.");
        TwoDimentionArray twoDimentionArray = new TwoDimentionArray();
        twoDimentionArray.show();

        System.out.println("* 3a)");
        // а. Вивести всі значення які вище діагоналі

        twoDimentionArray.printAboveDiagonal();

        System.out.println("* 3b)");
        // b. вивести всі значення які нижче діагоналі

        twoDimentionArray.printUnderDiagonal();


        System.out.println("\n** 4th part of homework.");

        IsBorn.iWasBorn(1);
        IsBorn.iWasBorn(5);

    }
}
