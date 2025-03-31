package BT_JavaOOP2.person;

public class Person {
    String name;
    int age;
    String gender;
    public String address;
    public String phone;

    public Person(String name, int age, String address, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
