package Session_7.SS7_K2;

public class Product {
    private String ProductID;
    private String ProductName;
    private double ProductPrice;

//    hàm khởi tạo
    public Product() {

    }

    public Product(String productID, String productName, double productPrice) {
        ProductID = productID;
        ProductName = productName;
        ProductPrice = productPrice;
    }


//    getter setter
    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }


    //    các phương thức khác
    public String getInfor() {
        return "ID: " +  ProductID +
                "\nName: " +  ProductName +
                "\nPrice: " +  ProductPrice;
    }
}
