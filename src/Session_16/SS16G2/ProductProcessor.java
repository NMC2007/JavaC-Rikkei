package Session_16.SS16G2;

import java.util.List;

public interface ProductProcessor<T> {
    void calculateTotalValue(List<T> products);
    void printProductList(List<T> products);

    default boolean hasExpensiveProduct(List<Product> products) {
        for (Product product : products) {
            if (product.getPrice() > 100) {
                return true;
            }
        }
        return false;
    }
}
