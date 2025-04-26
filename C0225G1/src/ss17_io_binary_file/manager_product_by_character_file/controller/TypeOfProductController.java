package ss17_io_binary_file.manager_product_by_character_file.controller;

import ss17_io_binary_file.manager_product_by_character_file.entity.Phone;
import ss17_io_binary_file.manager_product_by_character_file.entity.Television;
import ss17_io_binary_file.manager_product_by_character_file.service.IPhoneService;
import ss17_io_binary_file.manager_product_by_character_file.service.ITelevisionService;
import ss17_io_binary_file.manager_product_by_character_file.service.PhoneService;
import ss17_io_binary_file.manager_product_by_character_file.service.TelevisionService;
import ss17_io_binary_file.manager_product_by_character_file.view.PhoneView;
import ss17_io_binary_file.manager_product_by_character_file.view.ProductView;
import ss17_io_binary_file.manager_product_by_character_file.view.TelevisionView;

import java.util.List;
import java.util.Scanner;

public class TypeOfProductController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPhoneService phoneService = new PhoneService();
    private static final ITelevisionService televisionService = new TelevisionService();

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
                    Television television = TelevisionView.inputTelevision();
                    televisionService.add(television);
                    System.out.println("------Add Success------");
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
                    TelevisionView.displayTelevision(televisionService.findAll());
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
                    int idPhone = PhoneView.inputID();
                    if (phoneService.findId(idPhone)) {
                        phoneService.delete(idPhone);
                        System.out.println("------Delete Success------");
                    } else {
                        System.out.println("------ID not found------");
                    }
                    break;
                case 2:
                    System.out.println("------Delete television------");
                    int idTelevision = TelevisionView.inputID();
                    if (televisionService.findId(idTelevision)){
                        televisionService.delete(idTelevision);
                        System.out.println("------Delete Success------");
                    } else {
                        System.out.println("------ID not found------");
                    }
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
                    int idPhone = PhoneView.inputID();
                    if (phoneService.findId(idPhone)) {
                        Phone phone = PhoneView.inputForUpdate(idPhone);
                        phoneService.update(phone);
                        System.out.println("------Update success------");
                    } else {
                        System.out.println("------ID not found------");
                    }
                    break;
                case 2:
                    System.out.println("------Update television------");
                    int idTelevision = TelevisionView.inputID();
                    if (televisionService.findId(idTelevision)){
                        Television television = TelevisionView.inputForUpdate(idTelevision);
                        televisionService.update(television);
                        System.out.println("------Update success------");
                    } else {
                        System.out.println("------ID not found------");
                    }
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
                    String namePhone = ProductView.inputName();
                    phoneService.searchByName(namePhone);
                    break;
                case 2:
                    System.out.println("------Search television------");
                    String nameTelevision = ProductView.inputName();
                    televisionService.searchByName(nameTelevision);
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
                    int choicePhone = Integer.parseInt(scanner.nextLine());
                    switch (choicePhone) {
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
                    System.out.println("1. Ascending");
                    System.out.println("2. Descending");
                    System.out.println("Enter choice: ");
                    int choiceTelevision = Integer.parseInt(scanner.nextLine());
                    switch (choiceTelevision) {
                        case 1:
                            List<Television> ascendingListTelevision = televisionService.sortByPriceAscending();
                            TelevisionView.displayTelevision(ascendingListTelevision);
                            break;
                        case 2:
                            List<Television> descendingList = televisionService.sortByPriceDescending();
                            TelevisionView.displayTelevision(descendingList);
                            break;
                        default:
                            System.out.println("Please choice from 1 to 2");
                    }
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
