package Session_16.SS16G2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final ProductProcessorImpl productProcessor = new ProductProcessorImpl();

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop Dell", 1500000),
                new Product("Chuột Logitech", 350000),
                new Product("Bàn phím cơ", 1200000),
                new Product("Màn hình 24 inch", 3200000),
                new Product("Tai nghe Sony", 890000),
                new Product("Loa Bluetooth", 650000),
                new Product("USB 64GB", 180000),
                new Product("Ổ cứng SSD 512GB", 1450000),
                new Product("Webcam HD", 720000),
                new Product("Ghế gaming", 2500000)
        );

        productProcessor.calculateTotalValue(products);

        productProcessor.printProductList(products);


        if (productProcessor.hasExpensiveProduct(products)) {
            System.out.println("Có sản phẩm đắt tiền");
        } else {
            System.out.println("Không có sản phẩm dắt tiền");
        }
    }
}
