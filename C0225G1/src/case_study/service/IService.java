package case_study.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    void delete(int id);
    void add(T t);
    boolean findId(int id);
    void update(T t);
}
