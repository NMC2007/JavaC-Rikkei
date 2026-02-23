package Session_15.SS15_LT1;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class MovieMenu {
    private static final MovieManager movieManager = new MovieManager();
    public static void showMenu(Scanner sc) {
        while (true) {
            System.out.println("""
                    -------------------MOVIE MENU------------------------
                    1. Thêm phim
                    2. Xoá phim
                    3. Sửa phim
                    4. Hiển thị phim
                    5. Tìm kiếm phim theo tên
                    6. Lọc phim theo rating
                    7. Thoát
                    """);
            System.out.print("Nhập lựa chọn: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());

                if (choice < 1 || choice > 7) {
                    System.out.println("Lựa chọn không hợp lệ");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }

            switch (choice) {
                case 1:
                    addMovie(sc);
                    break;
                case 2:
                    deleteMovie(sc);
                    break;
                case 3:
                    updateMovie(sc);
                    break;
                case 4:
                    showMovieList();
                    break;
                case 5:
                    findByName(sc);
                    break;
                case 6:
                    findByRating(sc);
                    break;
                case 7:
                    System.out.println("Kết thúc chương trình");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

//    thêm
    private static void addMovie(Scanner sc) {
        Movie movie = new Movie();

//        id tự tăng
        movie.setId(findMaxId() + 1);

//        nhập thông tin
        movie.inputMovie(sc);

        movieManager.add(movie);
        System.out.println("✅ Thêm phim thành công!");
    }

//    hiển thị
    private static void showMovieList() {
        List<Movie> list = movieManager.display();
        if (list.isEmpty()) {
            System.out.println("Danh sách chưa có phim");
        } else {
            System.out.println("\n Danh sách các bộ phim");
            for (Movie movie : list) {
                movie.displayData();
            }
        }
        System.out.println("\n\n");
    }

//    xoá
    private static void deleteMovie(Scanner sc) {
        int id;
        while (true) {
            System.out.print("Nhập id phim cần xoá: ");

            try {
                id = Integer.parseInt(sc.nextLine());

                if (id <= 0) {
                    System.out.println("❌ ID phải Lớn hơn 0");
                    continue;
                }

                break; // nhập hợp lệ thì thoát vòng lặp

            } catch (NumberFormatException e) {
                System.out.println("❌ ID Không hợp lệ");
            }
        }

        movieManager.delete(id);
    }


//    sửa
    private static void updateMovie(Scanner sc) {
        int id;
        while (true) {
            System.out.print("Nhập id phim cần sửa: ");

            try {
                id = Integer.parseInt(sc.nextLine());

                if (id <= 0) {
                    System.out.println("❌ ID phải Lớn hơn 0");
                    continue;
                }

                break;

            } catch (NumberFormatException e) {
                System.out.println("❌ ID Không hợp lệ");
            }
        }

        boolean find = false;
        for (Movie movie : movieManager.display()) {
            if (movie.getId() == id) {
                find = true;
            }
        }

        if (find) {
            System.out.println("Sửa thông tin phim");
            Movie newMovie = new Movie();

//            id vẫn là id cũ
            newMovie.setId(id);
//            nhập thông tin mới
            newMovie.inputMovie(sc);
//            cập nhật
            movieManager.update(id, newMovie);

            System.out.println("✅ Sửa thông tin phim thành công!");
        } else {
            System.out.println("❌ Không tìm thấy phim có id này!");
        }
    }


//    tìm theo tên
    private static void findByName(Scanner sc) {
        String name;

        do {
            System.out.print("Nhập tên Phim cần tìm: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("❌ Không được để trống!");
            }
        } while (name.isEmpty());

        List<Movie> List = movieManager.findByName(name);

        if (List.isEmpty()) {
            System.out.println("Không tìm thấy phim này!");
        } else {
            System.out.println("Những bộ phim tìm thấy: ");
            for (Movie movie : List) {
                movie.displayData();
            }
        }
    }


//    tìm theo rating
private static void findByRating(Scanner sc) {

    int rating;

    while (true) {
        System.out.print("Nhập rating: ");

        try {
            rating = Integer.parseInt(sc.nextLine());

            if (rating < 0 || rating > 10) {
                System.out.println("❌ Rating không được bé hơn 0 hoặc lớn hơn 10");
                continue;
            }

            break;

        } catch (NumberFormatException e) {
            System.out.println("❌ Rating nhập vào không phải số hợp lệ!");
        }
    }

    List<Movie> list = movieManager.filterByRating(rating);

    if (list.isEmpty()) {
        System.out.println("Không tìm thấy phim có rating " + rating);
    } else {
        System.out.println("Danh sách phim có rating từ " + rating + " trở lên: ");
        for (Movie movie : list) {
            movie.displayData();
        }
    }
}

//    tìm id phim lớn nhất trong danh sách
    private static int findMaxId() {
        int maxId = 0;
        for (Movie movie : movieManager.display()) {
            if (maxId < movie.getId()) {
                maxId = movie.getId();
            }
        }
        return maxId;
    }
}
