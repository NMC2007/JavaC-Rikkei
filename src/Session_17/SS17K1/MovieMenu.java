package Session_17.SS17K1;

import java.util.List;
import java.util.Scanner;

public class MovieMenu {
    private static final MovieManager movieManager = new MovieManager();
    public static void showMenu(Scanner sc) {
        while (true) {

            System.out.println("""
                    ------------------- MOVIE MENU -------------------
                    1. Thêm phim
                    2. Xoá phim
                    3. Sửa phim
                    4. Hiển thị phim
                    5. Thoát
                    """);

            System.out.print("Nhập lựa chọn: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());

                if (choice < 1 || choice > 5) {
                    System.out.println("❌ Lựa chọn không hợp lệ!");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Vui lòng nhập số!");
                continue;
            }

            switch (choice) {
                case 1:
                    createMovie(sc);
                    break;

                case 2:
                    deleteMovie(sc);
                    break;

                case 3:
                    updateMovie(sc);
                    break;

                case 4:
                    showMovie();
                    break;

                case 5:
                    System.out.println("Kết thúc chương trình.");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void createMovie(Scanner sc) {
        Movie newMovie = new Movie();

        newMovie.inputMovie(sc);

        movieManager.add(newMovie);
    }

    private static void showMovie() {
        List<Movie> movies = movieManager.getAll();

        if (movies.isEmpty()) {
            System.out.println("Danh sách chưa có phim");
        } else {
            System.out.println("\n Danh sách các bộ phim");

            System.out.println("+-------+------------------------------------------+----------------------+--------+");
            System.out.printf("| %-5s | %-30s | %-30s | %-6s |\n",
                    "ID", "Title", "Director", "Year");
            System.out.println("+-------+--------------------------------+--------------------------------+--------+");

            for (Movie movie : movies) {
                movie.displayData();
            }

            System.out.println("+-------+--------------------------------+--------------------------------+--------+");
        }
        System.out.println("\n\n");
    }

    private static void deleteMovie(Scanner sc) {

        System.out.println("Xoá phim");
        int id = inputID(sc);

        if (!MovieManager.checkID(id)) {
            System.out.println("❌ ID không tồn tại!");
        } else {
            movieManager.delete(id);
        }

    }

    private  static void updateMovie(Scanner sc) {

        System.out.println("Sửa phim");
        int id = inputID(sc);

        if (!MovieManager.checkID(id)) {
            System.out.println("❌ ID không tồn tại!");
        } else {

            Movie newMovie = new Movie();
            newMovie.inputMovie(sc);

            movieManager.update(id, newMovie);
        }
    }



    private static int inputID(Scanner sc) {
        int id;

        while (true) {
            System.out.print("Nhập ID phim: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Không được để trống!");
                continue;
            }

            try {
                id = Integer.parseInt(input);

                if (id <= 0) {
                    System.out.println("❌ ID phải lớn hơn 0!");
                    continue;
                }

                break;

            } catch (NumberFormatException e) {
                System.out.println("❌ ID phải là số nguyên!");
            }
        }

        return id;
    }
}
