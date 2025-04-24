package ss12_java_collection_framework.bai_tap.bai_1_manager_product.repository;

import ss12_java_collection_framework.bai_tap.bai_1_manager_product.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.util.ReadAndWriteFile;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.view.ProductView;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String PRODUCT_FILE = "src/ss12_java_collection_framework/bai_tap/bai_1_manager_product/data/product.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        //đọc file và chuyển dữ liệu sang productList
        List<String> stringList = ReadAndWriteFile.readFile(PRODUCT_FILE);
        //chuyển dữ liệu stringList sang productList
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Product product = new Product(Integer.parseInt(array[0]),array[1],Double.parseDouble(array[2]));
            productList.add(product);
        }
        return productList;
        //return products;
    }

    @Override
    public void add(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToFile());
        ReadAndWriteFile.writeFile(PRODUCT_FILE,stringList,APPEND);
        //products.add(product);
    }

    @Override
    public boolean delete(int id) {
        boolean check = false;
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size();i++) {
            if (id == productList.get(i).getId()) {
                if (ProductView.comfirmDelete()) {
                    check = true;
                    productList.remove(i);
                    break;
                }
            }
        }
        //chuyển productList sang stringList
        List<String> stringList = new ArrayList<>();
        for (Product product: productList) {
            stringList.add(product.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(PRODUCT_FILE,stringList,NOT_APPEND);
        return check;
    }

//    @Override
//    public boolean edit(int id) {
//        boolean check = false;
//        List<Product> products = findAll();
//
//        for (Product product : products) {
//            if (product.getId() == id) {
//                Product editProduct = ProductView.editProduct();
//                product.setName(editProduct.getName());
//                product.setPrice(editProduct.getPrice());
//                check = true;
//                List<String> stringList = new ArrayList<>();
//                for (Product p : products) {
//                    stringList.add(p.getInfoToFile());
//                }
//                ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, NOT_APPEND);
//                break;
//            }
//        }
//        return check;
//    }

    @Override
    public Product findById(int id) {
        for (Product product: findAll()) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void saveAll(List<Product> productList) {
        List<String> stringList = new ArrayList<>();
        for (Product product : productList) {
            stringList.add(product.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, NOT_APPEND); // ghi đè file
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = findAll();

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
        List<Product> products =findAll();

        List<Product> sortedList = new ArrayList<>(products); // tạo bản sao mới
        sortedList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        return sortedList;
    }

    @Override
    public List<Product> sortDescending() {
        List<Product> products = findAll();

        List<Product> sortedList = new ArrayList<>(products); // tạo bản sao mới
        sortedList.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        return sortedList;
    }


}
