package Session_10.SS10_G2;

public class Car extends Vehicle {
    @Override
    public double accelerate() {
        speed += 10;
        return speed;
    }

    public double accelerate(double speed) {
        this.speed += speed;
        return this.speed;
    }

    public double accelerate(double speed, int seconds) {
        double increase = speed * seconds;
        this.speed += increase;
        return this.speed;
    }
}
