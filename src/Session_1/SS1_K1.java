package Session_1;

import java.util.Scanner;

public class SS1_K1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ban kinh: ");
        double r = sc.nextDouble();

        double result = Math.PI * r * r;

        System.out.printf("Diện tích: %f", result);
    }
}
