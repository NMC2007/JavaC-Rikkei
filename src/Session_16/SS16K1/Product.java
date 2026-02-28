package Session_16.SS16K1;

import java.util.Scanner;

public class Product implements IBaseProduct {

    int id;
    String name;
    double price;

//    hàm khởi tạo
    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

//    getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


//    override interface
    @Override
    public void inputProduct(Scanner sc,  boolean update) {

        if (!update) {
            while (true) {
                try {
                    System.out.print("Nhập ID sản phẩm: ");
                    int newId = Integer.parseInt(sc.nextLine());

                    if (newId <= 0) {
                        System.out.println("❌ ID phải lớn hơn 0!");
                        continue;
                    }

                    this.id = newId;
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("❌ ID phải là số nguyên hợp lệ!");
                }
            }
        }

        while (true) {
            System.out.print("Nhập tên sản phẩm: ");
            name = sc.nextLine().trim();
            if (!name.isEmpty()) break;
            System.out.println("❌ Tên không được để trống!");
        }

        while (true) {
            try {
                System.out.print("Nhập giá sản phẩm: ");
                double newPrice = Double.parseDouble(sc.nextLine());

                if (newPrice <= 0) {
                    System.out.println("❌ Giá phải lớn hơn 0!");
                    continue;
                }

                this.price = newPrice;
                break;

            } catch (NumberFormatException e) {
                System.out.println("❌ Giá phải là số hợp lệ!");
            }
        }
    }

    @Override
    public void displayProduct() {
        System.out.printf("| %-10d | %-25s | %-18.2f |\n", id, name, price);
    }
}
