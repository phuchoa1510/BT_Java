package BT_JAVABASIC2;

public class Calculator {
    public static int tinhTong2SoNguyen(){
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
    // có thể sử dụng double muốn độ chính xác cao hơn và tốn bộ nhớ hơn
    public static float tinhTich2SoThuc(){
        float d = 0.2f;
        float e = 1.3f;
        float f = d * e;
        return f;
    }
    public static void main(String[] args) {
        tinhTong2SoNguyen();
        tinhTich2SoThuc();
        int tong2songuyen = tinhTong2SoNguyen();
        float tich2sothuc = tinhTich2SoThuc();
        System.out.println(tong2songuyen);
        System.out.println(tich2sothuc);

    }
}
