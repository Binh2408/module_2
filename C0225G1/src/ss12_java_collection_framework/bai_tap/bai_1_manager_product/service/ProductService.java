package ss12_java_collection_framework.bai_tap.bai_1_manager_product.service;

import ss12_java_collection_framework.bai_tap.bai_1_manager_product.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.repository.ProductRepository;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.view.ProductView;

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
    public boolean delete(int id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            System.out.println("Ko tìm thấy sản phẩm có ID: " + id);
            return false;
        }
        if (!ProductView.comfirmDelete()) {
            System.out.println("Hủy xóa sản phẩm.");
            return false;
        }
        List<Product> productList = productRepository.findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                productRepository.saveAll(productList);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean edit(int id) {
        List<Product> productList = productRepository.findAll();
        Product product = productRepository.findById(id);
        if (product == null) {
            System.out.println("Ko tìm thấy sản phẩm có ID: " + id);
            return false;
        }
        Product updatedProduct = ProductView.editProduct(); // Gather updated product details
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        for (int i = 0; i < productList.size(); i++) {
            if (product.getId() == productList.get(i).getId()) {
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
                productRepository.saveAll(productList);
                return true;
            }
        }
        return false;
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
