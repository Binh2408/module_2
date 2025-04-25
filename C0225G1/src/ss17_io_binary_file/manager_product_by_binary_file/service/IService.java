package ss17_io_binary_file.manager_product_by_binary_file.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    void delete(int id);
    void add(T t);
    boolean findId(int id);
    void update(T t);
    void searchByName(String name);
    List<T> sortByPriceAscending();
    List<T> sortByPriceDescending();

}
