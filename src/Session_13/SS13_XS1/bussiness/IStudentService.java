package Session_13.SS13_XS1.bussiness;

import java.util.List;

public interface IStudentService<T> {
    void add(T t);
    List<T> findByName(String name);
    List<T>  rank(int n);
    List<T> display();
}
