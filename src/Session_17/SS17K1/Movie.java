package Session_17.SS17K1;

import java.util.Scanner;

public class Movie implements IBaseMovie {
    private int id;
    private String title;
    private String director;
    private int year;

    public Movie() {
    }

    public Movie(int id, String title, String director, int year) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void inputMovie(Scanner sc) {

        // ===== Nhập title =====
        while (true) {
            System.out.print("Nhập tiêu đề phim: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Tiêu đề không được để trống!");
            } else {
                this.title = input;
                break;
            }
        }

        // ===== Nhập director =====
        while (true) {
            System.out.print("Nhập tên đạo diễn: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Tên đạo diễn không được để trống!");
            } else {
                this.director = input;
                break;
            }
        }

        // ===== Nhập year =====
        while (true) {
            System.out.print("Nhập năm phát hành: ");
            String input = sc.nextLine().trim();

            try {
                int yearInput = Integer.parseInt(input);

                if (yearInput <= 1800) {
                    System.out.println("❌ Năm phải lớn hơn 1800!");
                } else {
                    this.year = yearInput;
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Năm phải là số nguyên!");
            }
        }
    }

    @Override
    public void displayData() {
        System.out.printf("| %-5d | %-30s | %-30s | %-6d |\n",
                id, title, director, year);
    }
}
