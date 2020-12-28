package ua.lits.java_base.hw7;

public class Visitor {
    static int visitorNo = 0;
    public static int price;
    public Action entering = Action.ENTERING;
    public Action paying = Action.PAYING;
    public Action leaving = Action.LEAVING;

    public String visitor;

    public Visitor(String visitor, int price) {
        this.visitor = visitor;
        Visitor.price = price;
        visitorNo++;
    }

    public void showVisitorEntranceAndPay() {
        System.out.println(
                "* " + visitor + " is " + entering + " the ZOO and " + paying + " for entrance ticket.");
    }

    public void showVisitorLeaving() {
        System.out.println("* " + visitor + " is " + leaving + " the ZOO.");
    }
}
