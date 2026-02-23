package Session_15.SS15_LT1;

import java.util.ArrayList;
import java.util.List;

public class MovieManager implements Manage<Movie> {
    private final List<Movie> movies = new ArrayList<>();

    @Override
    public void add(Movie movie) {
        movies.add(movie);
    }

    @Override
    public void update(int id, Movie movie) {
        int dltIndex = getIndex(id);
        if (dltIndex == -1) {
            System.out.println("❌ Không tìm thấy phim có id này!");
        } else {
            movies.set(dltIndex, movie);
            System.out.println("✅ Sửa thông tin phim thành công!");
        }
    }

    @Override
    public void delete(int id) {
        int dltIndex = getIndex(id);
        if (dltIndex == -1) {
            System.out.println("❌ Không tìm thấy phim có id này!");
        } else {
            movies.remove(dltIndex);
            System.out.println("✅ Xoá học sinh thành công!");
        }
    }

    @Override
    public List<Movie> findByName(String name) {
        List<Movie> result = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(name.trim().toLowerCase())) {
                result.add(movie);
            }
        }

        return result;
    }

    @Override
    public List<Movie> filterByRating(int rating) {
        List<Movie> result = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getRating() >= rating) {
                result.add(movie);
            }
        }

        return result;
    }

    @Override
    public List<Movie> display() {
        return movies;
    }


//    tìm id
    private int getIndex(int id) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
