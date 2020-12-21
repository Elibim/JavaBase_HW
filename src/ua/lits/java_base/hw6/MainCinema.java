package ua.lits.java_base.hw6;
import java.util.Scanner;

public class MainCinema {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(4, 9);
        Scanner in = new Scanner(System.in); //https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
        boolean exit = false;

        while(!exit) {
            System.out.println(" 1. Show seats \n 2. Book seat \n 3. Exit");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    cinema.showSeatScheme();
                    break;
                case 2:
                    System.out.println("Please input seat number: ");
                    int inputSeat = in.nextInt();
                    boolean success = cinema.bookSeat(inputSeat);
                    if(success) {
                        System.out.println(inputSeat + "booked successfully");
                    } else {
                        System.out.println("Seat taken");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Please check menu!!!");
                    break;
            }
        }


//        System.out.println(2/9);

    }

}

