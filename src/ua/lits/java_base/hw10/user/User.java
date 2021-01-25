package ua.lits.java_base.hw10;

public class User {
    public String firstName;
    public String surname;
    public String age;
    public String occupation;
    public String mobilePhoneNo;
    public String email;
    public String address /*(country = Ukraine, city, street, house & flat No )*/;

    public User(String firstName, String surname, String age, String occupation, String mobilePhoneNo, String email, String address) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.occupation = occupation;
        this.mobilePhoneNo = mobilePhoneNo;
        this.email = email;
        this.address = address;
    }

    void userInfo () {
        System.out.println("\n*****");
        System.out.println(String.join(",\n", firstName, surname, age, occupation, mobilePhoneNo, email, address));
    }
}
