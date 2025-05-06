package case_study.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    void delete(String id);
    void add(T t);
    boolean findId(String id);
    void update(T t);
}
