package ss17_io_binary_file.manager_product_by_character_file.view;

import ss17_io_binary_file.manager_product_by_character_file.entity.Phone;
import ss17_io_binary_file.manager_product_by_character_file.entity.Television;

import java.util.List;
import java.util.Scanner;

public class TelevisionView {
    private static Scanner scanner = new Scanner(System.in);
    public static Television inputTelevision() {
        System.out.println("Enter ID product: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name Product: ");
        String name = scanner.nextLine();
        System.out.println("Enter Price Product: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Manufacture Name: ");
        String manufactureName = scanner.nextLine();
        System.out.println("Enter Description Product: ");
        String description = scanner.nextLine();
        System.out.println("Enter inch: ");
        int inch = Integer.parseInt(scanner.nextLine());
        return new Television(id,name,price,manufactureName,description,inch);
    }
    public static void displayTelevision(List<Television> televisionList) {
        for (Television television : televisionList) {
            System.out.println(television);
        }
    }

    public static int inputID() {
        System.out.println("Enter ID television: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static Television inputForUpdate(int id) {
        System.out.println("Enter Name Product: ");
        String name = scanner.nextLine();
        System.out.println("Enter Price Product: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Manufacture Name: ");
        String manufactureName = scanner.nextLine();
        System.out.println("Enter Description Product: ");
        String description = scanner.nextLine();
        System.out.println("Enter inch: ");
        int inch = Integer.parseInt(scanner.nextLine());
        return new Television(id,name,price,manufactureName,description,inch);
    }
}
