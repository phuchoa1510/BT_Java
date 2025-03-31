package BT_JavaOOP1;

public class NhanVien {
    private String name;
    private int age;
    private String gender;
    private String address;

    public NhanVien() {

    }

    public NhanVien(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Hòa",23,"Nam","Long An");
        nhanVien.getInfo();

    }
}
