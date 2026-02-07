package Session_14;

import java.util.Scanner;

public class SS14_G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double accountBalance = 1000000;
        double minBalance = 50000;

        double withdraw = -1;
        while (withdraw <= 0 || (accountBalance - withdraw) < minBalance) {
            try {
                System.out.print("Nhập số tiền cần rút: ");
                withdraw = Double.parseDouble(sc.nextLine());
                if (withdraw <= 0) {
                    System.out.println("Số tiền cần rút phải lớn hơn 0");
                } else if (withdraw > accountBalance) {
                    System.out.println("Số tiền cần rút vượt quá số dư");
                } else if ((accountBalance - withdraw) < minBalance) {
                    System.out.println("Số dư sau rút phải lớn hơn 50.000");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Yêu cầu nhập vào một số hợp lệ");
            }
        }
        System.out.printf("Rút thành công %fĐ\n", withdraw);
        System.out.printf("Số dư còn lại: %f", accountBalance - withdraw);
    }
}
