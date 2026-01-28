package Session_10.SS10_K2;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Shape s1 = new Rectangle(2,3);
        Shape s2 = new Circle(1);

        double area1 = s1.area();
        double area2 = s2.area();

        System.out.println("Area of s1: " + area1);
        System.out.println("Area of s2: " + area2);
    }
}
