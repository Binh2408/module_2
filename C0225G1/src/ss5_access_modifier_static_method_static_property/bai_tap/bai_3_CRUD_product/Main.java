package ss5_access_modifier_static_method_static_property.bai_tap.bai_3_CRUD_product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product(1,"Máy tính", 100000);
        System.out.println(product.toString());
        
        Product product1 = new Product();
        System.out.println("Nhập id của sản phẩm: ");
        product1.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên sản phẩm: ");
        product1.setName(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        product1.setPrice(Integer.parseInt(scanner.nextLine()));
        System.out.println(product1.toString());
    }
}
