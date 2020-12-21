package ua.lits.java_base.hw7;

public class Visitors {
    public Actions entering = Actions.ENTERING;
    public Actions paying = Actions.PAYING;
    public Actions leaving = Actions.LEAVING;

    public String visitor;
    public int price;

    public Visitors(String visitor, int price) {
        this.visitor = visitor;
        this.price = price = 100;
    }

    public void showVisitorEnteranceAndPay() {
        System.out.println(
                "* " + visitor + " is " + entering + " the ZOO and " + paying + " for entrance ticket.");
    }

    public void showVisitorLeaving() {
        System.out.println("* " + visitor + " is " + leaving + " the ZOO.");
    }
}
