package Session_17.SS17G1;

import Connection.util.ConnectionDB;
import Session_17.SS17K1.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookManager implements Manager<Book> {
    @Override
    public void add(Book book) {

    }

    @Override
    public void update(int index, Book book) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public List<Book> findByAuthor(String author) {
        return List.of();
    }

    @Override
    public List<Book> display() {
//        List<Book> Books = new ArrayList<>();
//
//        try(
//                Connection conn = ConnectionDB.getConnection();
//                PreparedStatement pre = conn.prepareStatement("SELECT * FROM books");
//        ) {
//
//            ResultSet rs = pre.executeQuery();
//
//            while(rs.next()) {
//                Books movie = new Movie(
//                        rs.getInt("id"),
//                        rs.getString("title"),
//                        rs.getString("director"),
//                        rs.getInt("year")
//                );
//
//                Books.add(movie);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
        return List.of();
    }
}
