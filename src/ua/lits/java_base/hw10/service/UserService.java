package ua.lits.java_base.hw10.service;

import ua.lits.java_base.hw10.dataBase.UserDB;

public class UserService {
    private UserDB userRepository = new UserDB();

    public void getAllUsers() {
        System.out.println(userRepository);
    }
}
