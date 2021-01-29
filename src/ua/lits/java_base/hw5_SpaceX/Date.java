package ua.lits.java_base.hw5_SpaceX;

public class Date {

    private int year;
    private int month;
    private int day;

    Date(int year, int month, int day) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

//    public int getYear() {            /* getter in comment because is no need of it */
//        return year;
//    }

    public void setYear(int year) {
        if (year < 1000) {
            System.out.println("Wrong year format (YYYY)!");
        } else {
            this.year = year;
        }
    }

//    public int getMonth() {           /* getter in comment because is no need of it */
//        return month;
//    }

    public void setMonth(int month) {
        if (month > 12) {
            System.out.println("Check month No.!");
        } else {
            this.month = month;
        }
    }

//    public int getDay() {           /* getter in comment because is no need of it */
//        return day;
//    }

    public void setDay(int day) {
        if (day > 31) {
            System.out.println("Wrong day!");
        } else {
            this.day = day;
        }
    }

    String getFormattedDate() {
        return this.year+"."+month+"."+day;
    }
}
