package ss12_java_collection_framework.bai_tap.bai_1_manager_product.repository;

import ss12_java_collection_framework.bai_tap.bai_1_manager_product.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);

    boolean delete(int id);

//    boolean edit(int id);

    Product findById(int id);

    void saveAll(List<Product> productList);

    List<Product> search(String name);

    List<Product> sortAscending();

    List<Product> sortDescending();
}
