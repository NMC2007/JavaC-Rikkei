package Session_17.SS17G1;

import java.time.Year;
import java.util.Scanner;

public class Book implements IBaseBook {
    private int id;
    private String title;
    private String author;
    private Year publisher_year;
    private Double price;

    public Book() {
    }

    public Book(int id, String title, String author, Year publisher_year, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher_year = publisher_year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Year getPublisher_year() {
        return publisher_year;
    }

    public void setPublisher_year(Year publisher_year) {
        this.publisher_year = publisher_year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public void inputBook(Scanner sc) {

        // ====== Nhập tiêu đề ======
        while (true) {
            System.out.print("Nhập tiêu đề: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Tiêu đề không được để trống!");
            } else {
                this.title = input;
                break;
            }
        }

        // ====== Nhập tác giả ======
        while (true) {
            System.out.print("Nhập tác giả: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Tác giả không được để trống!");
            } else {
                this.author = input;
                break;
            }
        }

        // ====== Nhập năm xuất bản ======
        while (true) {
            System.out.print("Nhập năm xuất bản (yyyy): ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Năm xuất bản không được để trống!");
                continue;
            }

            try {
                int year = Integer.parseInt(input);

                if (year < 1000 || year > Year.now().getValue()) {
                    System.out.println("❌ Năm không hợp lệ!");
                    continue;
                }

                this.publisher_year = Year.of(year);
                break;

            } catch (NumberFormatException e) {
                System.out.println("❌ Năm phải là số!");
            }
        }

        // ====== Nhập giá ======
        while (true) {
            System.out.print("Nhập giá: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Giá không được để trống!");
                continue;
            }

            try {
                double price = Double.parseDouble(input);

                if (price <= 0) {
                    System.out.println("❌ Giá phải lớn hơn 0!");
                    continue;
                }

                this.price = price;
                break;

            } catch (NumberFormatException e) {
                System.out.println("❌ Giá phải là số!");
            }
        }
    }

    @Override
    public void outputBook() {
        System.out.printf("| %-5d | %-20s | %-20s | %-10s | %-10.2f |\n",
                id,
                title,
                author,
                publisher_year,
                price);
    }
}
