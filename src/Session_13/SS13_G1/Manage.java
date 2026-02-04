package Session_13.SS13_G1;

import java.util.List;

public interface Manage<T> {
    void add(T t);
    void update(int id, T t);
    void delete(int id);
    List<T> display();
}
