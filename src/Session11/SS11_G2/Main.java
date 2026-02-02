package Session11.SS11_G2;

public class Main {
    public static void main(String[] args) {
        Devide[] devide = new Devide[3];
        devide[0] = new Laptop();
        devide[1] = new SmartPhone();
        devide[2] = new Television();

        for (Devide d : devide) {
            d.turnOff();
            d.turnOn();
            if(d instanceof Connectable connectable) {
                connectable.connectWifi();
            }
            if(d instanceof Chargeable charge) {
                charge.charge();
            }
        }
    }
}
