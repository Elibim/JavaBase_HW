package ua.lits.java_base.hw10.dataBase;

import ua.lits.java_base.hw10.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private List<User> usersDB = new ArrayList<>();
    public void addUser(User user) {
        usersDB.add(user);
    }
    public List<User> getAll() {
        return usersDB;
    }
}
