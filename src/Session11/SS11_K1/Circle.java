package Session11.SS11_K1;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle() {
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Đã vẽ hình " + getName());
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
