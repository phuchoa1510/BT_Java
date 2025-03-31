package BT_JAVABASIC.BT_JAVABASIC1;

public class SinhVien {
    String uni_name = "UTH";//Biến Instance
    static int ID = 123145;//Biến static
    static String major = "Electronics and Telecommunications";//Biến static

    public void getInfo() {
        System.out.println(uni_name);
    }

    public static void main(String[] args) {
        String name = "Phúc Hòa";// Biến Local
        String class_name = "DV20A";//Biến Local
        System.out.println("Fullname: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Age: " + ThongTin.age);
        System.out.println("Hometown: " +ThongTin.hometown);
        System.out.println("Address: " + ThongTin.address);
        System.out.println("Major: " + major);
        System.out.println("Class: " + class_name);
    }

}
