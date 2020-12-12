package ua.lits.java_base.hw5;

public class SpaceX1c extends SpaceX1 {

    public boolean isCargo;

    public SpaceX1c(Date yearMonthDay, int crew, boolean isCargo, String destination) {
        super(yearMonthDay, crew, destination);
        this.isCargo = isCargo;
    }

    public void show() {
        System.out.println("SpaceX1c:" +
                "\n  Date of first flight: " + this.getYearMonthDay().getFormattedDate() +
                "\n  Crew: " + this.crew +
                "\n  Is re-flightible: " + this.isReflight +
                "\n  Can carry cargo: " + this.isCargo +
                "\n  Farthest destination: " + this.destination);
    }
}
