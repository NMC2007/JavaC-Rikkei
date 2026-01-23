package Session_8.SS8_K2;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Book book1 = new Book("Helo", "NMC", 1000000);

        System.out.printf("Title: %s, Author: %s, Price: %.2f%n", book1.getTitle(), book1.getAuthor(), book1.getPrice());
    }
}
