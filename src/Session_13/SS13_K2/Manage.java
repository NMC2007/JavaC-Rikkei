package Session_13.SS13_K2;

import java.util.List;

public interface Manage<T> {
    void add(T t);
    void update(int index, T t);
    void delete(int index);
    List<T> display();
}
