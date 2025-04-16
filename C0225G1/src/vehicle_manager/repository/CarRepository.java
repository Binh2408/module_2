package vehicle_manager.repository;

import vehicle_manager.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRepository implements ICarRepository{
    private static ArrayList<Car> cars = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        cars.add(new Car("43A-212.56","Toyota",2019,"Nguyễn Văn A",10,"Du lịch"));
        cars.add(new Car("43B-453.88","Huyndai",2020,"Nguyễn Văn B",45,"Xe khách"));
        cars.add(new Car("43B-453.89","Ford",2019,"Nguyễn Văn C",16,"Xe khách"));

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
                System.out.println("Bạn có muốn xóa hay không?(CÓ/KHÔNG)");
                String result = scanner.nextLine();
                if (result.equalsIgnoreCase("CÓ")) {
                    cars.remove(i);
                    System.out.println("Xóa thành công!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy biển kiểm soát!");
    }
}
