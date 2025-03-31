package BT_JavaOOP2.company;

import BT_JavaOOP2.person.Person;

public class company {
    public static void main(String[] args) {
        Person person = new Person("Hòa",23,"Long An","Nam","093418007");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
    }
}
