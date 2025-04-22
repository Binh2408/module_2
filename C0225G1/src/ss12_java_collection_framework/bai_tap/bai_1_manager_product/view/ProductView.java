package ss12_java_collection_framework.bai_tap.bai_1_manager_product.view;

import ss12_java_collection_framework.bai_tap.bai_1_manager_product.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static final Scanner scanner = new Scanner(System.in);

    //hiển thị danh sách
    public static void displayProduct(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    //nhập dữ liệu
    public static Product inputData(List<Product> currentList) {
        int id;
        while (true) {
            System.out.println("Nhập id sản phẩm: ");
            id = Integer.parseInt(scanner.nextLine());
            if (isIdExist(id, currentList)) {
                System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
            } else {
                break;
            }
        }
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(id, name, price);
    }

    //nhập id
    public static int inputID() {
        System.out.println("Nhập id sản phẩm: ");
        return Integer.parseInt(scanner.nextLine());
    }

    //xác nhận xóa
    public static boolean comfirmDelete() {
        System.out.print("Bạn có muốn xóa hay không? (CÓ/KHÔNG): ");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("CÓ");
    }

    //nhập để sửa
    public static Product editProduct() {
        System.out.println("Nhập tên sản phẩm để sửa: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm để sửa");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(0, name, price);
    }

    //nhập tên sản phẩm
    public static String inputName() {
        System.out.println("Nhập tên sản phẩm: ");
        return scanner.nextLine();
    }

    //kiểm tra id tồn tại
    public static boolean isIdExist(int id, List<Product> products) {
        for (Product product : products) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

}
