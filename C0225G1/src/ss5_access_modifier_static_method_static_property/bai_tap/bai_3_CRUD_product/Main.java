package ss5_access_modifier_static_method_static_property.bai_tap.bai_3_CRUD_product;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {
        do {
            System.out.println("---------------------Menu-------------------------");
            System.out.println("1. Display all products");
            System.out.println("2. Add new product");
            System.out.println("3. Edit product");
            System.out.println("4. Delete product");
            System.out.println("5. Search product");
            System.out.println("6. Exit");
            int choose;
            // Nhập lựa chọn có kiểm tra lỗi
            while (true) {
                System.out.print("Enter your choice: ");
                try {
                    choose = Integer.parseInt(scanner.nextLine().trim());
                    if (choose >= 1 && choose <= 6) {
                        break; // hợp lệ, thoát vòng lặp nhập
                    } else {
                        System.out.println("Please enter a number from 1 to 6.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                }
            }
            switch (choose) {
                case 1:
                    System.out.println("Display all products");
                    productManager.display();
                    break;
                case 2:
                    System.out.println("Add new product");
                    productManager.add();
                    break;
                case 3:
                    System.out.println("Edit product");
                    productManager.edit();
                    break;
                case 4:
                    System.out.println("Delete product");
                    productManager.delete();
                    break;
                case 5:
                    System.out.println("Search product");
                    productManager.search();
                    break;
                case 6:
                    System.out.println("See you again!!!");
                    return;
            }
        } while (true);
    }
    
}