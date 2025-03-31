package BT_JavaOOP3.testcases;

import BT_JavaOOP3.common.BaseTest;

public class TestCases extends BaseTest {
    public void testLogin(){
        System.out.println("Mở browser và nhập url: https://cms.anhtester.com/login");
        System.out.println("Nhập email và password hợp lệ");
        System.out.println("Nhấn nút Login");
        System.out.println("Đăng nhập thành công và chuyển hướng đến trang admin");

    }
    public void Login (){
        createDriver();
        testLogin();
        closeDriver();
    }

    public void AddCasegory(){
        createDriver();
        testLogin();
        System.out.println("Chọn mục Product trong Menu");
        System.out.println("Chọn mục Category");
        System.out.println("Ấn vào nút Add New category");
        System.out.println("Điền đầy đủ thông tin ");
        System.out.println("Ấn nút Save");
        closeDriver();

    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.Login();
        testCases.AddCasegory();
    }


}
