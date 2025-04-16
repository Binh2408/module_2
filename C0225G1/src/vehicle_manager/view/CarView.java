package vehicle_manager.view;

import vehicle_manager.entity.Car;
import vehicle_manager.service.CarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarView {
    private static Scanner scanner = new Scanner(System.in);
    private static CarService carService = new CarService();
    public static void displayCar(ArrayList<Car> cars) {
        if (cars.isEmpty()) {
            System.out.println("Danh sách xe rỗng.");
            return;
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static Car inputDataForCar() {
        System.out.println("Chức năng thêm oto");
        System.out.println("Nhập biển số xe: ");
        String controlPlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String manufacterName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int manufacterYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String ownerPerson = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int numbersOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe(Xe khách hay du lịch): ");
        String carType = scanner.nextLine();
        Car car = new Car(controlPlate, manufacterName, manufacterYear, ownerPerson, numbersOfSeats, carType);
        return car;
    }

    public static void deleteByControlPlate() {
        System.out.println("Nhập biển kiểm soát cần xóa: ");
        String controlPlate = scanner.nextLine();
        carService.deleteByControlPlateCar(controlPlate);;
    }
}
