package ua.lits.java_base.hw5;

public class SpaceX2 {

    private final Date yearMonthDay;
    public int crew;
    public boolean isReflight;
    public String destination;

    public SpaceX2(Date yearMonthDay, int crew, String destination) {
        this.yearMonthDay = yearMonthDay;
        this.crew = crew;
        this.isReflight = true; /* because it is speciality of series X2.. */
        this.destination = destination;
    }

    public Date getYearMonthDay() {
        return yearMonthDay;
    }

    public void show() {
        System.out.println("SpaceX2:" +
                "\n  Date of first flight: " + this.yearMonthDay.getFormattedDate() +
                "\n  Crew: " + this.crew +
                "\n  Is re-flightible: " + this.isReflight +
                "\n  Farthest destination: " + this.destination);
    }
}
