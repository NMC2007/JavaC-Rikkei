package Session_16.SS16K1;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public interface Manager<T> {
    void addProduct(Scanner sc);
    void totalPriceProduct();
    void updateProduct(int id, Scanner sc);
    void deleteProduct(int id);
    HashMap<Integer, T> getAllProducts();
    HashMap<Integer, T> filterProduct(double price);

}
