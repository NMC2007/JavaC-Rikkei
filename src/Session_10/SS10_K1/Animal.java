package Session_10.SS10_K1;

public class Animal {
    protected  String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println( this.name + " Some animal sound");
    }
}
