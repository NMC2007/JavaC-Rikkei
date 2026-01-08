package Session_2;

import java.util.Scanner;

public class SS2_G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        if (n < 0) {
            // gán n = chính nó nma dùng Math.abs để đảo từ số âm thành dương
            n = Math.abs(n);
        }

        while (n > 0) {
            // chia 10 lấy dư được số cuối cồng dồn vào sum
            sum += n%10;
            // chia 10 để bỏ số cuối
            n /= 10;
        }

        System.out.printf("Tổng các số là: %d", sum);
    }
}
