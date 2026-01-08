package Session_1;

import java.util.Scanner;

public class SS1_XS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vận tốc: ");
        float vanToc = sc.nextFloat();
        System.out.print("Nhập thời gian: ");
        float thoiGian =  sc.nextFloat();

        float quangDuong = vanToc * thoiGian;

        System.out.println("+------------------------+------------------------+");
        System.out.printf("| %-22s | %-22s | \n", "input", "output");
        System.out.println("+------------------------+------------------------+");
        System.out.printf("| %-20s | %-20s | \n", ("Thời gian = " + thoiGian + " (giờ) | \n" + "| Vận tốc = " + vanToc + " (km/h)"), ("Quãng đường = " + quangDuong + " km"));
        System.out.println("+------------------------+------------------------+");
    }
}
