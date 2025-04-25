package ss17_io_binary_file.manager_product_by_binary_file.controller;

import ss17_io_binary_file.manager_product_by_binary_file.controller.TypeOfProductController;

import java.util.Scanner;

public class ProductController {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayMenu() {
        do {
            System.out.println("------Manager Product------");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Search Product");
            System.out.println("4. Edit Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Sort Product");
            System.out.println("7. Exit");
            System.out.println("------Please choice function------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    TypeOfProductController.menuForAddFunction();
                    break;
                case 2:
                    TypeOfProductController.menuForDisplayFunction();
                    break;
                case 3:
                    TypeOfProductController.menuForSearchFunction();
                    break;
                case 4:
                    TypeOfProductController.menuForUpdateFunction();
                    break;
                case 5:
                    TypeOfProductController.menuForDeleteFunction();
                    break;
                case 6:
                    TypeOfProductController.menuForSortPriceFunction();
                    break;
                case 7:
                    System.out.println("See you again!!!");
                    System.exit(0);
                default:
                    System.out.println("Please choice from 1 to 7");
            }
        } while (true);

    }
}
