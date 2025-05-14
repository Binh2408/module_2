package test_cuoi_module_2.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    void add(T t);

}
