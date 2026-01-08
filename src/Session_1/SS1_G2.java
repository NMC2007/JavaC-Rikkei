package Session_1;

import java.util.Scanner;

public class SS1_G2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập Chiều dài: ");
        float width = sc.nextFloat();
        System.out.println("Nhập Chiều rộng: ");
        float height = sc.nextFloat();

        float area = width * height;
        float perimeter = 2 * (width + height);

        System.out.println("+-------------------------------------+-------------------------------------+");
        System.out.printf("| %-35s | %-35s | \n", "Input", "Output");
        System.out.println("+-------------------------------------+-------------------------------------+");
        System.out.printf("| width = %f height = %f | Dien tich: %f Chu vi: %f | \n", width, height, area, perimeter);
        System.out.println("+-------------------------------------+-------------------------------------+");
    }
}
