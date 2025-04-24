package vehicle_manager.controller;

import vehicle_manager.entity.Car;
import vehicle_manager.entity.Motorbike;
import vehicle_manager.entity.Truck;
import vehicle_manager.repository.VehicleRepository;
import vehicle_manager.service.CarService;
import vehicle_manager.service.MotorbikeService;
import vehicle_manager.service.TruckService;
import vehicle_manager.view.CarView;
import vehicle_manager.view.MotorbikeView;
import vehicle_manager.view.TruckView;
import vehicle_manager.view.VehicleView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CarService carService = new CarService();
    private static final TruckService truckService = new TruckService();
    private static final MotorbikeService motorbikeService = new MotorbikeService();
    private static final VehicleRepository vehicleRepository = new VehicleRepository();

    public static void displayMenu() {
        do {
            System.out.println("------Chọn loại xe cần hiển thị-----");
            System.out.println("1. Hiển thị xe tải");
            System.out.println("2. Hiển thị oto");
            System.out.println("3. Hiển thị xe máy");
            System.out.println("------------------------");
            int choice;
            while (true) {
                System.out.print("Nhập lựa chọn: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 3) {
                        break; // hợp lệ, thoát vòng lặp nhập
                    } else {
                        System.out.println("Nhập số từ 1 đến 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi nhập");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị xe tải");
                    ArrayList<Truck> trucks = truckService.findAll();
                    TruckView.displayTruck(trucks);
                    return;
                case 2:
                    System.out.println("Hiển thị xe oto");
                    List<Car> cars = carService.findAll();
                    CarView.displayCar(cars);
                    return;
                case 3:
                    System.out.println("Hiển thị xe máy");
                    List<Motorbike> motorbikes = motorbikeService.findAll();
                    MotorbikeView.displayMotorbike(motorbikes);
                    return;
            }
        } while (true);
    }

    public static void addVehicle() {
        do {
            System.out.println("Chọn loại xe cần thêm");
            System.out.println("1. Thêm xe tải");
            System.out.println("2. Thêm oto");
            System.out.println("3. Thêm xe máy");
            System.out.println("--------------------");
            int choice;
            while (true) {
                System.out.print("Nhập lựa chọn: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 3) {
                        break; // hợp lệ, thoát vòng lặp nhập
                    } else {
                        System.out.println("Vui lòng nhập từ 1 đến 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi nhập.");
                }
            }
            switch (choice) {
                case 1:
                    Truck truck = TruckView.inputDataForTruck();
                    truckService.add(truck);
                    System.out.println("Thêm thành công xe tải");
                    return;
                case 2:
                    Car car = CarView.inputDataForCar();
                    carService.add(car);
                    System.out.println("Thêm thành công xe oto");
                    return;
                case 3:
                    Motorbike motorbike = MotorbikeView.inputDataForMotorbike();
                    motorbikeService.add(motorbike);
                    System.out.println("Thêm thành công xe máy");
                    return;
            }
        } while (true);
    }

    public static void deleteVehicle() {
        String controlPlate = VehicleView.inputControlPlate();
        // Xác nhận trước khi xóa
        if (!VehicleView.confirmDelete()) {
            System.out.println("Hủy thao tác xóa.");
            return;
        }
        // Gọi phương thức từ repository để xóa phương tiện
        boolean result = vehicleRepository.deleteVehicleByControlPlate(controlPlate);
        if (result) {
            System.out.println("Xóa thành công phương tiện với biển kiểm soát: " + controlPlate);
        } else {
            System.out.println("Không tìm thấy phương tiện với biển kiểm soát: " + controlPlate);
        }
    }
}
