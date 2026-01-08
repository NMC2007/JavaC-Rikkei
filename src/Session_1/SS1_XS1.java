package Session_1;

import java.util.Scanner;

public class SS1_XS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều cao: ");
        float chieuCao = sc.nextFloat();
        System.out.print("Nhập cân nặng: ");
        float canNang =  sc.nextFloat();

        float BMI = canNang / (chieuCao * chieuCao);

        System.out.println("+----------------------+----------------------+");
        System.out.printf("| %-20s | %-20s | \n", "input", "output");
        System.out.println("+----------------------+----------------------+");
        System.out.printf("| %-20s | %-20s | \n", ("Cân nặng = " + canNang + " (kg) | \n" + "| Chiều cao = " + chieuCao + " (m)"), ("Chỉ số BMI = " + BMI));
        System.out.println("+----------------------+----------------------+");
    }
}
