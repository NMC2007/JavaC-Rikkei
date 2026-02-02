package Session11.SS11_K2;

public class CreditCardPayment extends Payment implements Refundable{
    @Override
    void pay() {
        System.out.println("CreditCardPayment");
    }

    @Override
    public void refund() {
        System.out.println("CreditCardPayment refund");
    }
}
