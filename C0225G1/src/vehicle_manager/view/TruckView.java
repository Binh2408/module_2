package vehicle_manager.view;

import vehicle_manager.entity.Truck;
import vehicle_manager.service.TruckService;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);
    private static TruckService truckService = new TruckService();
    public static void displayTruck(ArrayList<Truck> trucks) {
        if (trucks.isEmpty()) {
            System.out.println("Danh sách xe rỗng.");
            return;
        }

        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    public static Truck inputDataForTruck() {
        System.out.println("Chức năng thêm xe tải");
        System.out.println("Nhập biển số xe: ");
        String controlPlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String manufacterName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int manufacterYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String ownerPerson = scanner.nextLine();
        System.out.println("Nhập trọng tải: ");
        int weight = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(controlPlate, manufacterName, manufacterYear, ownerPerson, weight);
        return truck;
    }
    public static void deleteByControlPlate() {
        System.out.println("Nhập biển kiểm soát cần xóa: ");
        String controlPlate = scanner.nextLine();
        truckService.deleteByControlPlateTruck(controlPlate);;
    }
}
