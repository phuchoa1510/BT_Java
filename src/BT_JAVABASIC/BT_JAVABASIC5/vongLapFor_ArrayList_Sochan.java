package BT_JAVABASIC5;

import java.util.ArrayList;

public class vongLapFor_ArrayList_Sochan {
    public static void vongLapFor() {
        ArrayList<Integer> mangSoChan = new ArrayList<>();
        for (int i = 0; i <= 50; i = i + 2)
        {
            mangSoChan.add(i);
            System.out.println("mảng số chẵn: " + mangSoChan);
        }
        System.out.println("=======================================================Hoặc================================================================");
        for (int item : mangSoChan){
            System.out.println(item + " là số chẵn");
        }
    }

    public static void main(String[] args) {
        vongLapFor();
    }

}
