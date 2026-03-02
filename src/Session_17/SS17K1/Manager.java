package Session_17.SS17K1;

import java.util.List;

public interface Manager<T> {
    void  add(T item);
    void update(int id, T item);
    void delete(int id);
    List<T> getAll();
}
