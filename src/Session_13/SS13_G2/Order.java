package Session_13.SS13_G2;

import java.util.Scanner;

public class Order implements IBaseOrder {
    private int OderId;
    private String CustomerName;

    public Order() {
    }

    public Order(int oderId, String customerName) {
        OderId = oderId;
        CustomerName = customerName;
    }


//    getter setter
    public int getOderId() {
        return OderId;
    }

    public void setOderId(int oderId) {
        OderId = oderId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }



    @Override
    public void inputOder(Scanner sc) {

    }

    @Override
    public void displayData() {
        System.out.printf("Oder ID : %d | Customer: %s\n", OderId, CustomerName);
    }
}
