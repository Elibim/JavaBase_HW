package ua.lits.java_base.hw10_Admin_User.user;

public class User {
    public String password;
    public String firstName;
    public String surname;
    public int age;
    public String occupation;
    public String mobilePhoneNo;
    public String email;
    public String address /*(country = Ukraine, city, street, house & flat No )*/;
    public Role role;

    public User(String password, String firstName, String surname, int age, String occupation, String mobilePhoneNo,
                String email, String address, Role role) {
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.occupation = occupation;
        this.mobilePhoneNo = mobilePhoneNo;
        this.email = email;
        this.address = address;
        this.role = role;
    }

    void userInfo () {
        System.out.println("\n*****");
        System.out.println(firstName + " " +  surname + "\n" + age  + " years old" + "\n" + occupation +
                "\n" + mobilePhoneNo + "\n" + email + "\n" + address + "\n" + role + "\n");
    }
}
