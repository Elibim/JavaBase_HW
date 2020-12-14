package ua.lits.java_base.hw5;

import java.util.Random;

public class Additional_hw5 {


    //  - згенерувати рандомний масив на 100 елементів
    int maxRange = 20;

    public int[] generateRandomArrayOfSize(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int index = 0; index < size; index++) {
            array[index] = random.nextInt(maxRange);
//            System.out.print("[index No.:" + index + "], " + array[index]);
            System.out.print(array[index] + ", ");
        }
        return array;
    }

    public void showRandomArray(int[] array, int size) {
        for (int index = 0; index < size; index++) {
            System.out.print(array[index] + ", ");
//            System.out.print("[index No.:" + index + "], " + array[index]);
        }
    }

    //  - вивести суму всіх непарних індексів масиву

    public void showSumOfOddIndex(int[] array, int size) {
        int sum = 0;
        for (int index = 1; index < size; index = index + 2) {
            sum += array[index];
            System.out.print(array[index] + ", ");
        }
        System.out.print("\nSum of odd indexes is: " + sum);
//                System.out.print("[index No.:" + index + "], " + array[index]);
    }

    //  - вивести всі кратні 2,3,5

    public void showMultiplesOf2_3_5(int[] array, int size) {
        int div1 = 2;
        int div2 = 3;
        int div3 = 5;
        for (int index = 0; index < size; index++) {
            if (array[index] % div1 == 0) {
                System.out.print(array[index] + ", ");
            } else if (array[index] % div2 == 0) {
                System.out.print(array[index] + ", ");
            } else if (array[index] % div3 == 0) {
                System.out.print(array[index] + ", ");
            }
        }
    }

    //  - вести середнє значення всіх парних/непарних елементів

    public void showAverageOfOddElements(int[] array, int size) {
        System.out.println("Odd elements:");
        double sum = 0;
        double howMany = 0;
        for (int index = 0; index < size; index++) {
            if (array[index] % 2 != 0) {
                sum += array[index];
                howMany++;
//                System.out.println("Odd: ");
                System.out.print(array[index] + ", ");
            }
        }
        double oddAverage = sum / howMany;
        System.out.print("\nSum of odd: " + sum);
        System.out.println("\nHow many odd: " + howMany);
        System.out.println("Average of odd is " + oddAverage);
    }

    public void showAverageOfEvenElements(int[] array, int size) {
        System.out.println("Even elements:");
        double sum = 0;
        double howMany = 0;
        for (int index = 0; index < size; index++) {
            if (array[index] % 2 == 0) {
                sum += array[index];
                howMany++;
                System.out.print(array[index] + ", ");
            }
        }
        double evenAverage = sum / howMany;
        System.out.print("\nSum of even: " + sum);
        System.out.println("\nHow many even: " + howMany);
        System.out.println("Average of even is " + evenAverage);
    }

    //  - знайти нск в масиві
//    public void showLcmExample() {
//        System.out.println("Example array:");
//        int[] arrayExample = {2, 0, 1, 6, 0, 5, 2, 2, 7, 2};
//        int sizeExample = arrayExample.length;
//
//        for (int indexExample = 0; indexExample < sizeExample; indexExample++) {
//            System.out.print(arrayExample[indexExample] + ", ");
//        }
//        int n = sizeExample;
//        int swap = 0;
//        do {
//            for (int t = 0; t < n - 1; t++) {
//                if (arrayExample[t] > arrayExample[t + 1]) {
//
//                    swap = arrayExample[t];
//                    arrayExample[t] = arrayExample[t + 1];
//                    arrayExample[t + 1] = swap;
//                }
//            }
//            n = n - 1;
//        } while (n > 1);
//        System.out.println();
//        System.out.println("Sorted array:");
//        for (int y = 0; y < sizeExample; y++) {
//            System.out.print(arrayExample[y] + ", ");
//        }
//        int[] longCopy = new int[sizeExample];
//        int newLength = sizeExample;
//        System.out.println("\nArray without 0, 1 & repeating elements:");
//        int newIndex = 0;
//        for (int y = 0; y < sizeExample; y++) {
//            if (y + 1 == sizeExample) {
//                if (arrayExample[y] > 1) {
//                    longCopy[newIndex] = arrayExample[y];
//                    newIndex++;
//                }
//                break;
//            }
//            if (arrayExample[y] != arrayExample[y + 1] && arrayExample[y] > 1) {
//                longCopy[newIndex] = arrayExample[y];
//                newIndex++;
//            } else {
//                newLength--;
//            }
//        }
//        int[] copyArray = new int[newLength];
//        for (int i = 0; i < newLength; i++) {
//            copyArray[i] = longCopy[i];
//            System.out.print(copyArray[i] + ", ");
//        }
//    }
}