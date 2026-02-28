package Session_16.SS16K1;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class ProductMenu {
    private static final ProductManager productManager = new ProductManager();
    public static void showMenu(Scanner sc) {

        while (true) {
            System.out.println("""
                -------------------PRODUCT MENU------------------------
                1. Thêm sản phẩm
                2. Sửa sản phẩm
                3. Xóa sản phẩm
                4. Hiển thị sản phẩm
                5. Lọc sản phẩm theo giá
                6. Tính tổng giá trị sản phẩm
                7. Thoát
                """);

            System.out.print("Nhập lựa chọn: ");
            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());

                if (choice < 1 || choice > 7) {
                    System.out.println("❌ Lựa chọn không hợp lệ!");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Vui lòng nhập số hợp lệ!");
                continue;
            }

            switch (choice) {

                case 1:
                    addProduct(sc);
                    break;

                case 2:
                    updateProduct(sc);
                    break;

                case 3:
                    deleteProduct(sc);
                    break;

                case 4:
                    viewProduct();
                    break;

                case 5:
                    filterByPrice(sc);
                    break;

                case 6:
                    totalPriceProduct();
                    break;

                case 7:
                    System.out.println("Kết thúc chương trình.");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        }
    }

//    thêm
    private static void addProduct(Scanner sc) {
        productManager.addProduct(sc);
    }

//    hiển thị
    private static void viewProduct() {
        HashMap<Integer, Product> ProductsList = productManager.getAllProducts();

//        in bảng sản phẩm
        printTable(ProductsList);
    }

//    cập nhật lại sản phẩm
    private static void updateProduct(Scanner sc) {
//        nhập id hợp lệ
        int id = inputID(sc);

//        sau khi có id
        productManager.updateProduct(id, sc);
    }

//    xoá sản phẩm
    private static void deleteProduct(Scanner sc) {
//        nhập id hợp lệ
        int id = inputID(sc);

//        sau khi có id
        productManager.deleteProduct(id);
    }


//    lọc theo giá
private static void filterByPrice(Scanner sc) {
    double price = 0;
        while (true) {
            System.out.print("Nhập giá sản phẩm: ");
            String input = sc.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("❌ Không được để trống!");
                continue;
            }

            try {
                price = Double.parseDouble(input);

                if (price <= 0) {
                    System.out.println("❌ Giá phải lớn hơn 0!");
                    continue;
                }

                break; // hợp lệ thì thoát vòng lặp

            } catch (NumberFormatException e) {
                System.out.println("❌ Giá không hợp lệ! Vui lòng nhập số.");
            }
        }

        HashMap<Integer, Product> ProductsList = productManager.filterProduct(price);

//        in bảng kết quả
        printTable(ProductsList);
    }


//    tổng giá toàn bộ sản phẩm
    private static void totalPriceProduct() {
        productManager.totalPriceProduct();
    }


// logic in bảng
    private static void printTable(HashMap<Integer, Product>  ProductsList) {
        if (ProductsList.isEmpty()) {
            System.out.println("Danh sách hiện chưa có sản phẩm nào");
        } else {
            System.out.println("Danh sách sản phẩm");

            System.out.println("---------------------------------------------------------------");
            System.out.printf("| %-10s | %-25s | %-18s |\n", "ID", "Tên sản phẩm", "Giá");
            System.out.println("---------------------------------------------------------------");
            ProductsList.values().forEach(Product::displayProduct);
            System.out.println("---------------------------------------------------------------");
        }
    }

//    logic nhập id
    private static int inputID(Scanner sc) {
        int id;

        while (true) {
            System.out.print("Nhập ID: ");

            String input = sc.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("❌ Không được để trống!");
                continue;
            }

            try {
                id = Integer.parseInt(input);

                if (id <= 0) {
                    System.out.println("❌ ID phải lớn hơn 0!");
                    continue;
                }

                break;

            } catch (NumberFormatException e) {
                System.out.println("❌ Vui lòng nhập số nguyên hợp lệ!");
            }
        }

        return id;
    }
}
