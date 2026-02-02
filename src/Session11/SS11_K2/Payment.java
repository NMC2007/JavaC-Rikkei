package Session11.SS11_K2;

public abstract class Payment {
    private int amount;

    public Payment() {
    }

    public Payment(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    abstract void pay();
    public void printAmount() {
        System.out.println(this.amount);
    }
}
