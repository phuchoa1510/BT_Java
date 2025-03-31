package BT_JavaOOP2.person;

public class infomation {
    public static void main(String[] args) {
        Person ps1 = new Person("Hòa", 23, "Nam","Long An","0934189007");
        System.out.println(ps1.getName());
        System.out.println(ps1.getAge());
        System.out.println(ps1.getAddress());
        System.out.println(ps1.getGender());
        System.out.println(ps1.getPhone());
    }

}
