package Session_8.SS8_K1;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Student student1 = new Student(001, "Nguyễn Văn A", 18);

        System.out.printf("ID: %d, Name: %s, Age: %d%n", student1.getId(), student1.getName(), student1.getAge());
    }
}
