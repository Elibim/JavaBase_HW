package ua.lits.java_base.hw10_Admin_User;
import ua.lits.java_base.hw10_Admin_User.dataBase.UserDB;
import ua.lits.java_base.hw10_Admin_User.user.Role;
import ua.lits.java_base.hw10_Admin_User.user.User;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        User user1 = new User("Admin123","Eliza", "Martynyuk", 43, "student",
                "+380 676766298", "elibielska@gmail.com", "Ukraine, Pasiky-Zubrycki", Role.Admin);
        UserDB db = new UserDB();
        db.addUser(user1);


        Scanner welcome = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Please enter (1) for log in  \nor (2) for exit.");
            int input = welcome.nextInt();
            switch (input) {
                case 1:
                    Scanner logIn = new Scanner(System.in);
                    while (!exit) {
                        System.out.println("Enter password or (2) for exit from this menu:");
//                        String password = logIn.nextInt();
//                        if (String password  = "admin")
//                        int inputLogIn = logIn.nextInt();
//                        switch (inputLogIn) {
//                            case 1:
//                                System.out.println("Admin");
//                            case 2:
//                                System.out.println("User");
//                        }
                    }

                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Please check menu!!!");
                    break;
            }
        }
    }
}
