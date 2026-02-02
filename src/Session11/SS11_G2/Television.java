package Session11.SS11_G2;

public class Television extends Devide implements Connectable {
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
