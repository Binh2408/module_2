package case_study.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    void delete(int id);
    void add(T t);
    boolean findId(int id);
    void update(T t);
}
