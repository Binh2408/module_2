package vehicle_manager.view;

import vehicle_manager.entity.Truck;
import vehicle_manager.entity.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);
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
        Vehicle vehicle = VehicleView.inputVehicle();
        System.out.println("Nhập trọng tải: ");
        int weight = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(vehicle.getControlPlate(), vehicle.getManufacterName(), vehicle.getManufacterYear(), vehicle.getOwnerPerson(), weight);
        return truck;
    }
}
