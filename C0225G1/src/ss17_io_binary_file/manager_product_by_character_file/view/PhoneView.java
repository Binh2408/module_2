package ss17_io_binary_file.manager_product_by_character_file.view;

import ss17_io_binary_file.manager_product_by_character_file.entity.Phone;

import java.util.List;
import java.util.Scanner;

public class PhoneView {
    private static final Scanner scanner = new Scanner(System.in);

    public static Phone inputPhone() {
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
        System.out.println("Enter manufacture year: ");
        String manufactureYear = scanner.nextLine();
        return new Phone(id,name,price,manufactureName,description,manufactureYear);
    }


    public static void displayPhone(List<Phone> phoneList){
        for(Phone phone: phoneList){
            System.out.println(phone);
        }
    }

    public static int inputID(){
        System.out.println("Enter ID phone: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static Phone inputForUpdate(int id) {
        System.out.println("Enter Name Product: ");
        String name = scanner.nextLine();
        System.out.println("Enter Price Product: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Manufacture Name: ");
        String manufactureName = scanner.nextLine();
        System.out.println("Enter Description Product: ");
        String description = scanner.nextLine();
        System.out.println("Enter manufacture year: ");
        String manufactureYear = scanner.nextLine();
        return new Phone(id,name,price,manufactureName,description,manufactureYear);
    }
}
