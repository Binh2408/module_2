package ss12_java_collection_framework.bai_tap.bai_1_manager_product.service;

import ss12_java_collection_framework.bai_tap.bai_1_manager_product.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private static final IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public void edit(int id) {
        productRepository.edit(id);
    }

    @Override
    public List<Product> search(String name) {
        return productRepository.search(name);
    }

    @Override
    public List<Product> sortAscending() {
        return productRepository.sortAscending();
    }

    @Override
    public List<Product> sortDescending() {
        return productRepository.sortDescending();
    }
}
