package ss12_java_collection_framework.bai_tap.bai_1_manager_product.controller;

import ss12_java_collection_framework.bai_tap.bai_1_manager_product.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.service.IProductService;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.service.ProductService;
import ss12_java_collection_framework.bai_tap.bai_1_manager_product.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class ManagerController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IProductService productService = new ProductService();

    public static void displayMenu() {
        while (true) {
            System.out.println("----------Chức năng quản lý sản phẩm----------");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm");
            System.out.println("3.Xóa sản phẩm");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp sản phẩm theo giá");
            System.out.println("7.Thoát");
            System.out.println("-----------------------------------------------");
            System.out.print("Chọn chức năng: ");
            int choose = scanner.nextInt();
            if (choose == 7) {
                System.out.println("Hẹn gặp lại");
                break;
            }
            switch (choose) {
                case 1:
                    System.out.println("Thêm sản phẩm");
                    List<Product> currentList = productService.findAll();
                    Product product = ProductView.inputData(currentList);
                    productService.add(product);
                    System.out.println("-----Thêm thành công-----");
                    break;
                case 2:
                    System.out.println("Sửa sản phẩm");
                    productService.edit(ProductView.inputID());

                    break;
                case 3:
                    System.out.println("Xóa sản phẩm");
                    productService.delete(ProductView.inputID());
                    break;
                case 4:
                    System.out.println("Hiển thị sản phẩm");
                    List<Product> products = productService.findAll();
                    ProductView.displayProduct(products);
                    break;
                case 5:
                    System.out.println("Tìm kiếm sản phẩm");
                    List<Product> newList = productService.search(ProductView.inputName());
                    ProductView.displayProduct(newList);
                    break;
                case 6:
                    List<Product> productList = productService.findAll(); // lấy danh sách sản phẩm
                    System.out.println("Sắp xếp theo giá");
                    System.out.println("1.Tăng dần");
                    System.out.println("2.Giảm dần");
                    System.out.println("Chọn chức năng: ");
                    scanner.nextLine();
                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            productList = productService.sortAscending();
                            //sẽ bị sai khi chuyển double về int
//                            productList.sort(new Comparator<Product>() {
//                                @Override
//                                public int compare(Product o1, Product o2) {
//                                    return (int)(o1.getPrice()-o2.getPrice());
//                                }
//                            });
                            //cách tham khảo
                            // Sắp xếp tăng dần
//                            productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
//                            System.out.println("Danh sách sau khi sắp xếp tăng dần:");
                            ProductView.displayProduct(productList);
                            break;
                        case 2:
                            // Sắp xếp giảm dần
                            productList = productService.sortDescending();
                            System.out.println("Danh sách sau khi sắp xếp giảm dần:");
                            ProductView.displayProduct(productList);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                default:
                    System.out.println("Please choose from 1 to 6");
            }
        }
    }
}
