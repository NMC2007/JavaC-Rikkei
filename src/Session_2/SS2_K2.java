package Session_2;

import java.util.Scanner;

public class SS2_K2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tháng cần tìm: ");
        int Thang = sc.nextInt();

        switch(Thang) {
            case 1,3,5,7,8,10,12:
                System.out.printf("Tháng %d có số ngày là 31", Thang);
                break;
            case 4,6,9,11:
                System.out.printf("Tháng %d có số ngày là 30", Thang);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 hoặc 29 ngày", Thang);
                break;
            default:
                System.out.println("Tháng không hợp lệ");
        }
    }
}
