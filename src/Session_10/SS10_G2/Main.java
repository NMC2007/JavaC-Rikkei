package Session_10.SS10_G2;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Vehicle car1 = new Car();

        double speedCar1 = car1.accelerate(5, 8);

        System.out.printf("Tốc độ sau khi tăng: %f", speedCar1);
        System.out.print("\n");
        car1.printStatus();
    }
}
