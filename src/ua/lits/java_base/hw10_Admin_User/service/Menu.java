package ua.lits.java_base.hw10_Admin_User.service;

public class Menu {
    private static final int GET_USER_INFO = 1;

    private UserService userService = new UserService();


    public void start() {
        System.out.println("Hello");
    }

    public void input(int number) {

        if( number == GET_USER_INFO) {
            getUserInfo();
        }

    }

    public void getUserInfo() {
        System.out.println("hello");
    }

    public void getAllUsers() {
        userService.getAllUsers();

    }
}
