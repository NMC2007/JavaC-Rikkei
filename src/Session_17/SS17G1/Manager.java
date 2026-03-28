package Session_17.SS17G1;

import java.util.List;

public interface Manager<T> {
    void add(T t);
    void update(int index, T t);
    void delete(int index);
    List<T> findByAuthor(String author);
    List<T> display();
}
