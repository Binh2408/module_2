package ss17_io_binary_file.manager_product_by_binary_file.view;

import java.util.Scanner;

public class ProductView {
    private static final Scanner scanner = new Scanner(System.in);
    public static String inputName() {
        System.out.println("Enter Name Product: ");
        return scanner.nextLine();
    }
}
