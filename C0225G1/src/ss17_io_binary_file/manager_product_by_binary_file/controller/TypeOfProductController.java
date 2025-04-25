package ss17_io_binary_file.manager_product_by_binary_file.controller;

import ss17_io_binary_file.manager_product_by_binary_file.entity.Phone;
import ss17_io_binary_file.manager_product_by_binary_file.service.IPhoneService;
import ss17_io_binary_file.manager_product_by_binary_file.service.PhoneService;
import ss17_io_binary_file.manager_product_by_binary_file.view.PhoneView;
import ss17_io_binary_file.manager_product_by_binary_file.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class TypeOfProductController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPhoneService phoneService = new PhoneService();

    //thêm
    public static void menuForAddFunction() {
        boolean backToMainMenu = false;
        do {
            System.out.println("------Add Product------");
            System.out.println("1. Add Phone");
            System.out.println("2. Add Television");
            System.out.println("3. Exit to Main Menu");
            System.out.println("------Please choice function------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("------Add phone------");
                    Phone phone = PhoneView.inputPhone();
                    phoneService.add(phone);
                    System.out.println("------Add Success------");
                    break;
                case 2:
                    System.out.println("------Add television------");
                    break;
                case 3:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Please choice from 1 to 3");
            }
        } while (!backToMainMenu);
    }
    //hiển thị
    public static void menuForDisplayFunction() {
        boolean backToMainMenu = false;
        do {
            System.out.println("------Display Product------");
            System.out.println("1. Display Phone");
            System.out.println("2. Display Television");
            System.out.println("3. Exit to Main Menu");
            System.out.println("------Please choice function------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("------Display all phone------");
                    PhoneView.displayPhone(phoneService.findAll());
                    break;
                case 2:
                    System.out.println("------Display all television------");
                    break;
                case 3:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Please choice from 1 to 3");
            }
        } while (!backToMainMenu);
    }
    //xóa
    public static void menuForDeleteFunction() {
        boolean backToMainMenu = false;
        do {
            System.out.println("------Delete Product------");
            System.out.println("1. Delete Phone");
            System.out.println("2. Delete Television");
            System.out.println("3. Exit to Main Menu");
            System.out.println("------Please choice function------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("------Delete phone------");
                    int id = PhoneView.inputID();
                    if (phoneService.findId(id)) {
                        phoneService.delete(id);
                        System.out.println("------Delete Success------");
                    } else {
                        System.out.println("------ID not found------");
                    }
                    break;
                case 2:
                    System.out.println("------Delete television------");
                    break;
                case 3:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Please choice from 1 to 3");
            }
        } while (!backToMainMenu);
    }
    //sửa
    public static void menuForUpdateFunction() {
        boolean backToMainMenu = false;
        do {
            System.out.println("------Update Product------");
            System.out.println("1. Update Phone");
            System.out.println("2. Update Television");
            System.out.println("3. Exit to Main Menu");
            System.out.println("------Please choice function------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("------Update phone------");
                    int id = PhoneView.inputID();
                    if (phoneService.findId(id)) {
                        Phone phone = PhoneView.inputForUpdate(id);
                        phoneService.update(phone);
                        System.out.println("------Update success------");
                    } else {
                        System.out.println("------ID not found------");
                    }
                    break;
                case 2:
                    System.out.println("------Update television------");
                    break;
                case 3:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Please choice from 1 to 3");
            }
        } while (!backToMainMenu);
    }
    //tìm kiếm
    public static void menuForSearchFunction() {
        boolean backToMainMenu = false;
        do {
            System.out.println("------Search Product------");
            System.out.println("1. Search Phone");
            System.out.println("2. Search Television");
            System.out.println("3. Exit to Main Menu");
            System.out.println("------Please choice function------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("------Search phone------");
                    String name = ProductView.inputName();
                    phoneService.searchByName(name);
                    break;
                case 2:
                    System.out.println("------Search television------");
                    break;
                case 3:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Please choice from 1 to 3");
            }
        } while (!backToMainMenu);
    }
    //sửa
    public static void menuForSortPriceFunction() {
        boolean backToMainMenu = false;
        do {
            System.out.println("------Sort Product By Price------");
            System.out.println("1. Sort Phone");
            System.out.println("2. Sort Television");
            System.out.println("3. Exit to Main Menu");
            System.out.println("------Please choice function------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("------Sort phone------");
                    System.out.println("1. Ascending");
                    System.out.println("2. Descending");
                    System.out.println("Enter choice: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            List<Phone> ascendingList = phoneService.sortByPriceAscending();
                            PhoneView.displayPhone(ascendingList);
                            break;
                        case 2:
                            List<Phone> descendingList = phoneService.sortByPriceDescending();
                            PhoneView.displayPhone(descendingList);
                            break;
                        default:
                            System.out.println("Please choice from 1 to 2");
                    }
                    break;
                case 2:
                    System.out.println("------Sort television------");
                    break;
                case 3:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Please choice from 1 to 3");
            }
        } while (!backToMainMenu);
    }
}
