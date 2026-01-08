package Session_3;

import java.util.Scanner;

public class SS3_LT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== NHẬP THÔNG TIN HOÁ ĐƠN ==========");
        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.print("Nhập tên sản phầm: ");
        String product = sc.nextLine();
        System.out.print("Nhập giá sản phầm: ");
        float price = sc.nextFloat();
        System.out.print("Nhập số luượng mua: ");
        int quantity = sc.nextInt();
        System.out.print("Khách có thẻ thành viên? (true / false): ");
        boolean memberCard = sc.nextBoolean();

        float totalPrice = price * quantity;
        float VAT = totalPrice * 0.08f;
        float totalReduce = memberCard ? totalPrice * 0.1f : 0;

        float total = totalPrice - totalReduce + VAT;

        System.out.println("==================== HOÁ ĐƠN ====================");
        System.out.printf("Khách hàng: %s\n", name);
        System.out.printf("Sản phẩm: %s\n", product);
        System.out.printf("số lượng: %d\n", quantity);
        System.out.printf("Đơn giá: %f VND\n", price);
        System.out.printf("Thành tiền: %f VND\n", totalPrice);
        System.out.printf("Giảm giá thành viên (10%%): %f VND\n", totalReduce);
        System.out.printf("Tiền VAT (8%%): %f VND\n", VAT);
        System.out.printf("Tổng thanh toán: %f VND\n", total);

    }
}
