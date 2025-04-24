package vehicle_manager.repository;

import vehicle_manager.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarRepository {
    List<Car> findAll();
    void add(Car car);
    boolean deleteByControlPlateCar(String controlPlate);
    Car findByControlPlateCar(String controlPlate);
    void saveAll(List<Car> cars);
    boolean editByControlPlateCar(String controlPlate);
}
