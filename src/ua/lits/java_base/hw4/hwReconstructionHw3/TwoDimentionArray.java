package ua.lits.java_base.hw4.hwReconstructionHw3;

public class TwoDimentionArray {

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

    void show() {
        for (int x = 0; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                System.out.print(a3[x][y] + ", ");
            }
            System.out.println();
        }
    }

    public void printAboveDiagonal() {
        for (int x = 0; x <= 9 -1; x++) {
            for (int y = x + 1; y <= 9; y++) {
                System.out.print(a3[x][y] + ", ");
            }
            System.out.println();
        }
    }


    public void printUnderDiagonal() {
        for (int x = 1; x <= 9; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(a3[x][y] + ", ");
            }
            System.out.println();
        }
    }
}

