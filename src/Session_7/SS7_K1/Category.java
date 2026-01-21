package Session_7.SS7_K1;

import Session_7.SS7_K2.Product;

import java.util.List;

public class Category {
    private String CategoryID;
    private String CategoryName;
    private List<Product> products;

//    hàm khởi tạo
    public Category() {

    }

    public Category(String categoryID, String categoryName, List<Product> products) {
        CategoryID = categoryID;
        CategoryName = categoryName;
        this.products = products;
    }

//    getter setter

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


//    các phương thức khác

    // thêm sản phẩm vào list
    public void addProduct(Product product)
    {
        products.add(product);
    }

    // xoá sản phẩm khỏi list
    public void  removeProduct(Product product)
    {
        products.remove(product);
    }

    public String getInfo() {
        return "Category ID:" + CategoryID +
                "\nName: " +  CategoryName +
                "\nTotal product: " +  products.size();
    }


}
