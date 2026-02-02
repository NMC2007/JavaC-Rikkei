package Session11.SS11_K1;

public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Đã vẽ hình " + getName());
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }
}
