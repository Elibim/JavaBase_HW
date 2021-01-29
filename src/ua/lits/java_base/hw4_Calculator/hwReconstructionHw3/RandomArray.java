package ua.lits.java_base.hw4_Calculator.hwReconstructionHw3;

import java.util.Random;

public class RandomArray {

    public int[] generateArrayOfSize(int size) {
        int[] a2 = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            a2[i] = r.nextInt(47);
//            System.out.println("a2[" + i + "] = " + a2[i]);
            System.out.print(a2[i] + ", ");
        }
        return a2;
    }

    public void show(int[] arr, int size) {
        for (int y = 0; y < size; y++) {
            System.out.print(arr[y] + ", ");
        }
    }

    public int getMaxValue(int[] a2, int size) {
        int max = 0;
        for (int i = 0; i < size; i++) {
//            System.out.println(max + " < " + a2[i]);
            if (max < a2[i]) {
                max = a2[i];
            }
        }
        return max;
    }

    public int getMinValue(int[] a2, int size) {
        int min = a2[0];
        for (int i = 0; i < size; i++) {
//            System.out.println(min + " > " + a2[i]);
            if (min > a2[i]) {
                min = a2[i];
            }
        }
        return min;
    }

    public void printOppositeDir(int[] a2, int size) {
        for (int c1 = size - 1; c1 >= 0; c1--) {
        System.out.print(a2[c1] + ", ");
        }
    }

    public void printEven(int[] a2, int size) {
        for (int d1 = 0; d1 <= size -1; d1++) {
            if (a2[d1] % 2 != 0){
                System.out.print(a2[d1] + ", ");
            }
        }
    }

    public void printSorted(int[] a2, int size) {
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
    }
}