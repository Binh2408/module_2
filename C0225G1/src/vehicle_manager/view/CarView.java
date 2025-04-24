package vehicle_manager.view;

import vehicle_manager.entity.Car;
import vehicle_manager.entity.Vehicle;

import java.util.List;
import java.util.Scanner;

public class CarView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayCar(List<Car> cars) {
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
        Vehicle vehicle = VehicleView.inputVehicle();
        System.out.println("Nhập số chỗ ngồi: ");
        int numbersOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe(Xe khách hay du lịch): ");
        String carType = scanner.nextLine();
        Car car = new Car(vehicle.getControlPlate(), vehicle.getManufacterName(), vehicle.getManufacterYear(), vehicle.getOwnerPerson(), numbersOfSeats, carType);
        return car;
    }


}
