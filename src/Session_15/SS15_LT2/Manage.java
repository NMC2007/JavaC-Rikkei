package Session_15.SS15_LT2;

import java.util.List;

public interface Manage<T> {
    void add(T item);
    void delete(String code);
    List<T> display();
    List<T> findByName(String name);
    List<T> filterByCredits(int credits);
}
