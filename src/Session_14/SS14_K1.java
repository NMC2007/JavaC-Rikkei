package Session_14;

import java.util.Scanner;

public class SS14_K1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n <= 0) {
            try {
                System.out.print("Nhập vào số cần kiểm tra: ");
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("Lỗi! số nhập vào phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Cần nhập vào số nguyên hợp lệ");
            }
        }

        boolean prime = true;
        if (n == 2) {
            prime = false;
            System.out.printf("%d Là số nguyên tố", n);
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.printf("%d Không phải số nguyên tố", n);
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.printf("%d là số nguyên tố", n);
        }

    }
}
