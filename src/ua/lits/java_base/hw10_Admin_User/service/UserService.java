package ua.lits.java_base.hw10_Admin_User.service;

import ua.lits.java_base.hw10_Admin_User.dataBase.UserDB;

public class UserService {
    private UserDB userRepository = new UserDB();

    public void getAllUsers() {
        System.out.println(userRepository);
    }
}
