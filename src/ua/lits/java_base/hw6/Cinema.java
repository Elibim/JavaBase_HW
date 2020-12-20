package ua.lits.java_base.hw6;

public class Cinema implements ICinema {

    boolean[][] seats;

    public Cinema(int row, int column) {
        this.seats = new boolean[row][column];
    }

    @Override
    public void showSeatScheme() {
        for(int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j]) {
                    System.out.print("X  ");
                } else {
                    int col = j+1;
                    int prevRowsSum = seats[i].length * i;
                    System.out.print(col + prevRowsSum + "  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public boolean bookSeat(int seatNo) {
        int colLength = seats[0].length;
        int row, col, prevRowsSum;
        if (seatNo > colLength) {
            row = (seatNo / colLength);
            prevRowsSum = colLength * row;
            col = seatNo - prevRowsSum - 1;
        } else {
            row = 0;
            col = seatNo - 1;
        }

        if (!seats[row][col]) {
            seats[row][col] = true;
            return true;
        } else {
            return false;
        }
    }
}
