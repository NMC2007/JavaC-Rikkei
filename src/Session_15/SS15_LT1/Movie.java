package Session_15.SS15_LT1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Movie implements IBaseMovie {
    private int id;
    private String title;
    private String director;
    private LocalDate releaseDate;
    private double rating;

//    hàm khởi tạo
    public Movie() {
    }
    public Movie(int id, String title, String director, LocalDate releaseDate, double rating) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

//    getter and setter
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public void inputMovie(Scanner sc) {

        // ===== nhập title =====
        String title;
        do {
            System.out.print("Nhập tiêu đề phim: ");
            title = sc.nextLine().trim();
            if (title.isEmpty()) {
                System.out.println("❌ Tiêu đề không được để trống!");
            }
        } while (title.isEmpty());
        this.title = title;


        // ===== nhập director =====
        String director;
        while (true) {
            System.out.print("Nhập đạo diễn: ");
            director = sc.nextLine().trim();

            if (director.isEmpty()) {
                System.out.println("❌ Tên đạo diễn không được để trống!");
                continue;
            }

            // không được chứa số
            if (!director.matches("[a-zA-ZÀ-ỹ\\s]+")) {
                System.out.println("❌ Tên đạo diễn không được chứa số!");
                continue;
            }

            break;
        }

        this.director = director;


        // ===== nhập rating (double) =====
        double rating;
        while (true) {
            try {
                System.out.print("Nhập rating (0 - 10): ");
                rating = Double.parseDouble(sc.nextLine());

                if (rating < 0 || rating > 10) {
                    System.out.println("❌ Rating phải nằm trong khoảng 0 - 10!");
                    continue;
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("❌ Rating không được để trống và phải là số!");
            }
        }
        this.rating = rating;


        // ===== nhập releaseDate =====
        LocalDate releaseDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while (true) {
            try {
                System.out.print("Nhập ngày phát hành (dd-MM-yyyy): ");
                String inputDate = sc.nextLine().trim();

                releaseDate = LocalDate.parse(inputDate, formatter);
                break;

            } catch (DateTimeParseException e) {
                System.out.println("❌ Ngày không hợp lệ hoặc sai định dạng! Vui lòng nhập đúng dd-MM-yyyy.");
            }
        }
        this.releaseDate = releaseDate;
    }

    @Override
    public void displayData() {
        System.out.printf("ID: %d |  title: %s | release date: %s | rating: %s\n", id, title, releaseDate, rating);
    }
}
