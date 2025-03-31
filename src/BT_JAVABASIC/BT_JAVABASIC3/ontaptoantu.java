package BT_JAVABASIC3;

public class ontaptoantu {
    static int a = 10;
    static int b = 20;
    static int c = 30;
    static int d = 10;
    static String e = "Java Basic";
    static String f = "Java Basic";
    static String g = "Java Advance";

    static int number = 100;

    public static void check(int n) {
        if (n == number) {
            System.out.println("n = " + number);
        } else if (n < number) {
            System.out.println("n < " + number);
        } else if (n > number) {
            System.out.println("n > " + number);
        }
    }

    public static void main(String[] args) {
        System.out.println("a = b: " + (a == b));
        System.out.println("a = d: " + (a == d));
        System.out.println("a < b: " + (a < b));
        System.out.println("c > b: " + (c > b));
        System.out.println("e giong f: " + (e == f));
        System.out.println("Case Pass1(2 condition): " + ((a == d) && (e == f)));
        System.out.println("Case Pass2(2 condition): " + ((a == c) && (e == f)));
        System.out.println("Case Pass3(1 condition): " + ((a > c) || (e == f)));
        System.out.println("Case Pass4(1 condition): " + ((a > c) || (e == g)));
        check(100);
        check(90);
        check(200);
    }
}
