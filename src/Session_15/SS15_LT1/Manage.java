package Session_15.SS15_LT1;

import java.util.List;

public interface Manage<T> {
    void add(T t);
    void update(int index, T t);
    void delete(int index);
    List<T> display();
    List<T> findByName(String name);
    List<T> filterByRating(int rating);
}
