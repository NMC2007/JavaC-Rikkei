package Session_1;

import java.util.Scanner;

public class SS1_K2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất: ");
        int firstNumber = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int secondNumber = sc.nextInt();

        System.out.println("=========== Kết quả ===========");
        System.out.printf("firstNumber: %d \n", firstNumber);
        System.out.printf("secondNumber: %d \n", secondNumber);
        System.out.printf("Tổng: %d \n", firstNumber + secondNumber);
        System.out.printf("Hiệu %d \n", firstNumber - secondNumber);
        System.out.printf("Tích %d \n",  firstNumber * secondNumber);
        System.out.printf("Thương: %f \n", (float)firstNumber / (float)secondNumber);
        System.out.printf("Phần dư: %d \n", firstNumber % secondNumber);
    }
}
