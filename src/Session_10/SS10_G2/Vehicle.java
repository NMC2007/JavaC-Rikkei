package Session_10.SS10_G2;

public class Vehicle {
    protected double speed = 0;

    public double accelerate() {
        return speed;
    }
    public double accelerate(double speed) {
        return this.speed;
    }
    public double accelerate(double speed, int seconds) {
        return this.speed;
    }

    public void printStatus() {
        System.out.println("Speed: " + this.speed);
    }
}
