package test_cuoi_module_2.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    void add(T t);
}
