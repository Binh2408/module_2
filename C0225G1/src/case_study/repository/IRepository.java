package case_study.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    void delete(String id);
    void add(T t);
    boolean findId(String id);
    void update(T t);
}
