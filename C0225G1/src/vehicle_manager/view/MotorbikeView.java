package vehicle_manager.view;

import vehicle_manager.entity.Motorbike;
import vehicle_manager.service.MotorbikeService;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeView {
    private static Scanner scanner = new Scanner(System.in);
    private static MotorbikeService motorbikeService = new MotorbikeService();
    public static void displayMotorbike(ArrayList<Motorbike> motorbikes) {
        if (motorbikes.isEmpty()) {
            System.out.println("Danh sách xe rỗng.");
            return;
        }
        for (Motorbike motorbike: motorbikes) {
            System.out.println(motorbike);
        }
    }

    public static Motorbike inputDataForMotorbike() {
        System.out.println("Chức năng thêm xe tải");
        System.out.println("Nhập biển số xe: ");
        String controlPlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String manufacterName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int manufacterYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String ownerPerson = scanner.nextLine();
        System.out.println("Nhập công suất");
        int power = Integer.parseInt(scanner.nextLine());
        Motorbike motorbike = new Motorbike(controlPlate,manufacterName,manufacterYear,ownerPerson,power);
        return motorbike;
    }

    public static void deleteByControlPlate() {
        System.out.println("Nhập biển kiểm soát cần xóa: ");
        String controlPlate = scanner.nextLine();
        motorbikeService.deleteByControlPlateMotor(controlPlate);;
    }

}
