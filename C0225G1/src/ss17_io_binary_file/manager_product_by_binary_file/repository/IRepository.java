package ss17_io_binary_file.manager_product_by_binary_file.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    void delete(int id);
    void add(T t);
    boolean findId(int id);
    void update(T t);
    List<T> searchByName(String name);
    List<T> sortByPriceAscending();
    List<T> sortByPriceDescending();
}
