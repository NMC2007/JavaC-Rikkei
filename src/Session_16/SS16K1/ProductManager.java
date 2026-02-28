package Session_16.SS16K1;

import java.util.HashMap;
import java.util.Scanner;

public class ProductManager implements Manager<Product> {
    private static final HashMap<Integer, Product> productMap = new HashMap<>();


    @Override
    public void addProduct(Scanner sc) {
        Product product = new Product();

        product.inputProduct(sc, false);
//        lấy ra id sản phẩm product.getId()
//        dùng .containsKey() chọc vào productMap là nơi lưu trữ
//        kiểm tra xem id sản phẩm đã tồn tại chưa
//        rồi thì trả về true -> lọt vào if và không thêm sản phẩm
        if (productMap.containsKey(product.getId())) {
            System.out.println("❌ Không thể thêm vì ID sản phẩm đã tồn tại!");
        } else {
            productMap.put(product.getId(), product);
            System.out.println("✅ Thêm thành công sản phẩm vào danh sách!");
        }
    }

    @Override
    public void totalPriceProduct() {

        double total = 0;

        for (Product product : productMap.values()) {
            total += product.getPrice();
        }

        System.out.println("Tổng giá trị toàn bộ hàng: " + total);
    }

    @Override
    public void updateProduct(int id, Scanner sc) {
        if (!productMap.containsKey(id)) {
            System.out.println("❌ Không tìm thấy sản phẩm!");
        } else {
            System.out.println("✅ Đã tìm thấy sản phẩm\nNhập thông tin cần thay đổi");

//            tạo sản phẩm mới
            Product newProduct = new Product();

//            set id vẫn là id cũ và cho nhập vào nhưng dưới dạng update nên
//            bỏ qua trường nhập id
            newProduct.setId(id);
            newProduct.inputProduct(sc, true);

//            thêm sản phẩm mới vào id cũ đề ghi đè
            productMap.put(id, newProduct);
            System.out.println("✅ Cập nhật thành công!");
        }
    }

    @Override
    public void deleteProduct(int id) {
        if (!productMap.containsKey(id)) {
            System.out.println("❌ Không tìm thấy sản phẩm!");
        } else {
            productMap.remove(id);
            System.out.println("✅ Đã xoá sản phẩm thành công");
        }
    }

    @Override
    public HashMap<Integer, Product> getAllProducts() {
        return productMap;
    }

    @Override
    public HashMap<Integer, Product> filterProduct(double price) {
        HashMap<Integer, Product> result = new HashMap<>();

        for (Product product : productMap.values()) {
            if (product.getPrice() >= price) {
                result.put(product.getId(), product);
            }
        }

        return result;
    }
}
