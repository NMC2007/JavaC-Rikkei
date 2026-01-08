package Session_2;

import java.util.Scanner;

public class SS2_K1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        System.out.print("Nhập N: ");
        int N = sc.nextInt();

        if ( N <= 0 ) {
            System.out.printf("Số %d không hợp lệ", N);
        } else {
            for (int i = 0; i <= N; i++) {
                total += i;
            }
            System.out.printf("Tổng các số từ 1 đến %d bằng %d", N, total);
        }
    }
}
