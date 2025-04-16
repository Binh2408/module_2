package vehicle_manager.view;

import vehicle_manager.entity.Vehicle;

import java.util.Scanner;

public class VehicleView {
    private static final Scanner scanner = new Scanner(System.in);
    public static Vehicle inputVehicle() {
        System.out.println("Nhập biển số xe: ");
        String controlPlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String manufacterName = scanner.nextLine();
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
