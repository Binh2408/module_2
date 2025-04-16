package vehicle_manager.controller;

import java.util.Scanner;

public class ManagerController {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.println("----------------------------------");
            int choice;
            while (true) {
                System.out.print("Nhập lựa chọn: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 4) {
                        break; // hợp lệ, thoát vòng lặp nhập
                    } else {
                        System.out.println("Vui lòng chọn từ 1 đến 4.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi nhập.");
                }
            }
            if (choice == 4) {
                System.out.println("Hẹn gặp lại!!! ");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Thêm mới");
                    VehicleController.addVehicle();
                    break;
                case 2:
                    System.out.println("Hiển thị");
                    VehicleController.displayMenu();
                    break;
                case 3:
                    System.out.println("Xóa");
                    VehicleController.deleteVehicle();
                    break;
                default:
                    System.out.println("No choice!!!");
                    System.out.println("Please choice from 1 to 4!!!");
            }
        } while (true);
    }
}
