package ss12_java_collection_framework.bai_tap.bai_1_manager_product.repository;

import ss12_java_collection_framework.bai_tap.bai_1_manager_product.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.view.ProductView;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Vở", 20000));
        products.add(new Product(9, "Sách", 30000));
        products.add(new Product(3, "Bút", 15000));
        products.add(new Product(2, "Bút Chì", 25000));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (ProductView.comfirmDelete()) {
                    products.remove(product);
                    System.out.println("------Xóa thành công------");
                    return;
                }
            }
        }
        System.out.println("Không tìm thấy id sản phẩm: " + id);
    }

    @Override
    public void edit(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                Product editProduct = ProductView.editProduct();
                product.setName(editProduct.getName());
                product.setPrice(editProduct.getPrice());
                System.out.println("------Sửa thành công------");
                return;
            }
        }
        System.out.println("Không tìm thấy id sản phẩm: " + id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> newList = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().trim().contains(name)) {
                newList.add(product);
            }
        }
        return newList;
    }

    @Override
    public List<Product> sortAscending() {
        List<Product> sortedList = new ArrayList<>(products); // tạo bản sao mới
        sortedList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        return sortedList;
    }

    @Override
    public List<Product> sortDescending() {
        List<Product> sortedList = new ArrayList<>(products); // tạo bản sao mới
        sortedList.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        return sortedList;
    }


}
