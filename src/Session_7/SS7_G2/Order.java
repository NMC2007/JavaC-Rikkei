package Session_7.SS7_G2;

public class Order {
    private int orderID;
    private Customer customer;
    private double total;

    public Order() {
    }

    public Order(int orderID, Customer customer, double total) {
        this.orderID = orderID;
        this.customer = customer;
        this.total = total;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void printOrder() {
    }
}
