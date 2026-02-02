package Session11.SS11_G2;

public abstract class Devide {
    private int id;
    private String name;

    public Devide() {
    }

    public Devide(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void turnOn();
    abstract public void turnOff();
}
