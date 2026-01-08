package Session_1;

import java.util.Scanner;

public class SS1_G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tử số A: ");
        int A = sc.nextInt();
        System.out.println("Nhập mẫu số B: ");
        int B = sc.nextInt();

        System.out.println("Nhập tử số C: ");
        int C = sc.nextInt();
        System.out.println("Nhập mẫu số D: ");
        int D = sc.nextInt();

        int tongTuSo = A * D + B * C;
        int tongMauSo = B * D;

        System.out.println("+------------+------------+------------+------------+------------+------------+");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | \n", "Test case", "Tử 1 (a)", "Mẫu 1 (b)", "Tử 2 (c)", "Mẫu 2 (d)", "Kết quả");
        System.out.println("+------------+------------+------------+------------+------------+------------+");
        System.out.printf("| %-10d | %-10d | %-10d | %-10d | %-10d | %-10s | \n", 1, A, B, C, D, (tongTuSo + " / " + tongMauSo));
        System.out.println("+------------+------------+------------+------------+------------+------------+");
    }
}
