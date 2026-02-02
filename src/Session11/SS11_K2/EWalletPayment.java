package Session11.SS11_K2;

public class EWalletPayment extends Payment implements Refundable {
    @Override
    void pay() {
        System.out.println("EWalletPayment");
    }

    @Override
    public void refund() {
        System.out.println("EWalletPayment refund");
    }
}
