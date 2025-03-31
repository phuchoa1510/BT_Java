package BT_JAVABASIC5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Collection_TTNV {
    public static ArrayList<String> thongTinNhanVien() {
        ArrayList<String> thongTin  = new ArrayList<>();
        thongTin.add("Ngọc Hoàng Đại Đế");
        thongTin.add("Nam");
        thongTin.add("Trên mây");
        return thongTin;
        }

    public static ArrayList<String> addNew(String name, String gender,String address) {
        ArrayList<String> thongTin  = new ArrayList<>();
        thongTin.add(name);
        thongTin.add(gender);
        thongTin.add(address);
        return thongTin;
    }

    public static void main(String[] args) {
        thongTinNhanVien();
        ArrayList<String>thongTin = addNew("Dương Mẫu Nương Nương","Nữ","Thiên Đình");
        for (String item : thongTin){
            System.out.println(item);
        }
    }

}
