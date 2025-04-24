package ss12_java_collection_framework.bai_tap.bai_1_manager_product.service;

import ss12_java_collection_framework.bai_tap.bai_1_manager_product.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product product);

    boolean delete(int id);

    boolean edit(int id);

    List<Product> search(String name);

    List<Product> sortAscending();

    List<Product> sortDescending();
}
