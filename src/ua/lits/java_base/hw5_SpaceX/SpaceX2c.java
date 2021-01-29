package ua.lits.java_base.hw5_SpaceX;

public class SpaceX2c extends SpaceX2{

    public boolean isCargo;

    public SpaceX2c(Date yearMonthDay, int crew, boolean isCargo, String destination) {
        super(yearMonthDay, crew, destination);
        this.isCargo = isCargo;
    }

    public void show() {
        System.out.println("SpaceX2c:" +
                "\n  Date of first flight: " + this.getYearMonthDay().getFormattedDate() +
                "\n  Crew: " + this.crew +
                "\n  Is re-flightible: " + this.isReflight +
                "\n  Can carry cargo: " + this.isCargo +
                "\n  Farthest destination: " + this.destination);
    }
}
