package ua.lits.java_base.hw5_SpaceX;

public class SpaceX1 {

    private final Date yearMonthDay;
    public int crew;
    public boolean isReflight;
    public String destination;

    public SpaceX1(Date yearMonthDay, int crew, String destination) {
        this.yearMonthDay = yearMonthDay;
        this.crew = crew;
        this.isReflight = false; /* because it is speciality of series X1.. */
        this.destination = destination;
    }

    public Date getYearMonthDay() {
        return yearMonthDay;
    }

    public void show() {
        System.out.println("SpaceX1:" +
                "\n  Date of first flight: " + this.yearMonthDay.getFormattedDate() +
                "\n  Crew: " + this.crew +
                "\n  Is re-flightible: " + this.isReflight +
                "\n  Farthest destination: " + this.destination);
    }
}
