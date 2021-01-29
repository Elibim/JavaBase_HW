package ua.lits.java_base.hw7_ZOO;

public class Employees {

    public String employee;
    public Action action;

    public Employees(String employee, Action action) {
        this.employee = employee;
        this.action = action;
    }

    public void doSomething() {
        System.out.println(employee + " is " + action + ".");
    }

    public void income() {
        System.out.println("  " + Visitor.visitorNo + " * " + Visitor.price + " = " +
                Visitor.visitorNo * Visitor.price + "\n  Its today's income.");
    }
}
