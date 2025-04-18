package vehicle_manager.view;

import vehicle_manager.common.ManufacterList;
import vehicle_manager.entity.Vehicle;

import java.util.Scanner;

public class VehicleView {
    private static final Scanner scanner = new Scanner(System.in);
    public static Vehicle inputVehicle() {
        System.out.println("Nhập biển số xe: ");
        String controlPlate = scanner.nextLine();
//        System.out.println("Nhập hãng sản xuất: ");
//        String manufacterName = scanner.nextLine();
        // Hiển thị danh sách hãng sản xuất để người dùng chọn
        System.out.println("Chọn hãng sản xuất từ danh sách sau:");
        for (int i = 0; i < ManufacterList.manufactureList.size(); i++) {
            String[] parts = ManufacterList.manufactureList.get(i).split(",");
            System.out.println((i + 1) + ". " + parts[1] + " - " + parts[2]);
        }

        int choice;
        while (true) {
            System.out.print("Nhập số tương ứng với hãng sản xuất: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= ManufacterList.manufactureList.size()) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập số trong khoảng từ 1 đến " + ManufacterList.manufactureList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi định dạng! Vui lòng nhập số.");
            }
        }
        // Lấy tên hãng được chọn
        String[] selectedManufacturer = ManufacterList.manufactureList.get(choice - 1).split(",");
        String manufacterName = selectedManufacturer[1].trim(); // chỉ lấy tên hãng (bỏ mã và quốc gia)
        System.out.println("Nhập năm sản xuất: ");
        int manufacterYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String ownerPerson = scanner.nextLine();
        return new Vehicle(controlPlate,manufacterName,manufacterYear,ownerPerson);
    }
    public static String inputControlPlate() {
        System.out.println("Nhập biển kiểm soát: ");
        return scanner.nextLine();
    }

    public static boolean confirmDelete() {
        System.out.print("Bạn có muốn xóa hay không? (CÓ/KHÔNG): ");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("CÓ");
    }
}
