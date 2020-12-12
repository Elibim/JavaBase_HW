package ua.lits.java_base.hw5;

public class SpaceX2Mars extends SpaceX2c{

    public int passengers;

    public SpaceX2Mars(Date yearMonthDay, int crew, boolean isCargo, String destination, int passengers) {
        super(yearMonthDay, crew, isCargo, destination);
        this.passengers = passengers;
    }

    public void show() {
        System.out.println("SpaceX2Mars:" +
                "\n  Date of first flight: " + this.getYearMonthDay().getFormattedDate() +
                "\n  Crew: " + this.crew +
                "\n  Is re-flightible: " + this.isReflight +
                "\n  Can carry cargo: " + this.isCargo +
                "\n  Farthest destination: " + this.destination +
                "\n  Commercial passengers: " + this.passengers);
    }
}
