package BT_JAVABASIC4;

public class vongLapFor_SoChan {

    public static void main(String[] args) {
        int mangSoChan [] = new int[26];
        int vitri = 0;
        for (int i = 0; i <= 50; i = i + 2) {
            if ( i % 2 == 0){
                mangSoChan[vitri] = i;
                vitri++;
            }
        }
        for ( int item : mangSoChan){
            System.out.println(item );
        }
    }
}
