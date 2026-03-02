package Session_17.SS17K1;

import Connection.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieManager implements Manager<Movie> {
    @Override
    public void add(Movie movie) {

        try(
                Connection conn = ConnectionDB.getConnection();
                PreparedStatement pre = conn.prepareStatement("INSERT INTO movies (title, director, year) VALUES (?, ?, ?)");
        ) {
            pre.setString(1, movie.getTitle());
            pre.setString(2, movie.getDirector());
            pre.setInt(3, movie.getYear());

            pre.execute();

            System.out.println("✅ Thêm phim thành công!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(int id, Movie newMovie) {

        String updateSql = """
                UPDATE movies
                    SET title = ?,
                        director = ?,
                        year = ?
                WHERE id = ?
                """;

        try (
                Connection conn = ConnectionDB.getConnection();
                PreparedStatement updatePre = conn.prepareStatement(updateSql);
        ) {

            updatePre.setString(1, newMovie.getTitle());
            updatePre.setString(2, newMovie.getDirector());
            updatePre.setInt(3, newMovie.getYear());
            updatePre.setInt(4, id);
            updatePre.execute();

            System.out.println("✅ Sửa thông tin thành công");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {

        String deleteSql = "DELETE FROM movies WHERE id = ?";

        try (
                Connection conn = ConnectionDB.getConnection();
                PreparedStatement deletePre = conn.prepareStatement(deleteSql);
            ) {

            deletePre.setInt(1, id);
            deletePre.execute();

            System.out.println("✅ Xoá phim thành công!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Movie> getAll() {
        List<Movie> movieList = new ArrayList<>();

        try(
                Connection conn = ConnectionDB.getConnection();
                PreparedStatement pre = conn.prepareStatement("SELECT * FROM movies");
        ) {

            ResultSet rs = pre.executeQuery();

            while(rs.next()) {
                Movie movie = new Movie(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("director"),
                        rs.getInt("year")
                );

                movieList.add(movie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movieList;
    }


// kiểm tra id tồn tại hay không
    public static boolean checkID(int id) {

        String checkSql = "SELECT id FROM movies WHERE id = ?";

        boolean check = false;

        try (
                Connection conn = ConnectionDB.getConnection();
                PreparedStatement checkPre = conn.prepareStatement(checkSql);
        ) {
            checkPre.setInt(1, id);
            ResultSet rs = checkPre.executeQuery();
            if (rs.next()) {
                check = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return check;
    }
}
