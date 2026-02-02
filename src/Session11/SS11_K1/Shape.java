package Session11.SS11_K1;

public abstract class Shape {
    private String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public void displayInfo(){
        System.out.println("Name: "+ this.name);
    }
}
