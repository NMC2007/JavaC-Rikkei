package Session11.SS11_G2;

public class Laptop extends Devide implements Connectable, Chargeable {

    @Override
    public void charge() {
        System.out.println("Sạc");
    }

    @Override
    public void connectWifi() {
        System.out.println("Kết nối");
    }

    @Override
    public void turnOn() {
        System.out.println("Đã được bật");
    }

    @Override
    public void turnOff() {
        System.out.println("Đã được tắt");
    }
}
