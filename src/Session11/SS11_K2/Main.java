package Session11.SS11_K2;

public class Main {
    public static void main(String[] args) {
        Payment[]  payments = new Payment[3];

        payments[0] = new CashPayment();
        payments[1] = new CreditCardPayment();
        payments[2] = new EWalletPayment();

        for (Payment payment : payments) {
            payment.pay();
//            nếu payment có implements Refundable
//            tự động ép kiểu payment từ Payment thành Refundable
//            và gán vào một biến refundable biến này chỉ tồn tại
//            trong if sau đó gọi refund()
            if(payment instanceof Refundable refundable){
                refundable.refund();
            }
        }
    }
}
