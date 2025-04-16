package vehicle_manager.repository;

import vehicle_manager.entity.Car;
import vehicle_manager.view.VehicleView;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRepository implements ICarRepository {
    private static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", 10, "Du lịch"));
        cars.add(new Car("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", 45, "Xe khách"));
        cars.add(new Car("43B-453.89", "Ford", 2019, "Nguyễn Văn C", 16, "Xe khách"));

    }

    @Override
    public ArrayList<Car> findAll() {
        return new ArrayList<>(cars);
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void deleteByControlPlateCar(String controlPlate) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getControlPlate().equals(controlPlate)) {
                if (VehicleView.confirmDelete()) {
                    cars.remove(i);
                    System.out.println("Xóa thành công!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy biển kiểm soát!");
    }
}
