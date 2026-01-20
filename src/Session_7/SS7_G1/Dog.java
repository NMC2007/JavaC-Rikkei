package Session_7.SS7_G1;

public class Dog extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String color) {
        this.color = color;
    }

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void bark() {

    }
}
