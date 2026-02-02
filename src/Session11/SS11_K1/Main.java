package Session11.SS11_K1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("hình tròn 1", 5);
        shapes[1] = new Rectangle("Hình chữ nhật 1", 3, 5);

        for (Shape shape : shapes) {
            System.out.println(shape.getName());
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
            if(shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.draw();
            } else {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.draw();
            }
        }
    }
}
