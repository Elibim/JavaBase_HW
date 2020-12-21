package ua.lits.java_base.hw7;

public class Employees {
    Actions feeding = Actions.FEEDING;
    Actions actions = Actions.CLEANING;
    Actions counting = Actions.COUNTING;

    public String employee;
    public Actions action;

    public Employees(String employee, Actions action) {
        this.employee = employee;
        this.action = action;
    }
}
