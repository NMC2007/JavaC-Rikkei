package Session_16.SS16G2;

import java.util.ArrayList;
import java.util.List;

public class ProductProcessorImpl implements ProductProcessor<Product> {

    @Override
    public void calculateTotalValue(List<Product> products) {
        if (products == null || products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng!");
            return;
        }

        double total = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.printf("Tổng giá trị các sản phẩm: %,.0f%n", total);
    }

    @Override
    public void printProductList(List<Product> products) {
        if (products == null || products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng!");
            return;
        }

        products.forEach(System.out::println);
    }
}
