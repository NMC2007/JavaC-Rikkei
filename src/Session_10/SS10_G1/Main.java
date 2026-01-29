package Session_10.SS10_G1;

public class Main {
    public static void main(String[] args) {
        Computer p = new Computer();

        double price1 = p.calculatePrice(100);
        double price2 = p.calculatePrice(100, 10);
        double price3 = p.calculatePrice(100, 10, 5);

        System.out.println("Giá gốc: " + price1);
        System.out.println("Giá + thuế: " + price2);
        System.out.println("Giá + thuế - giảm giá: " + price3);
    }
}
