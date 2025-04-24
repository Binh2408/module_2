package vehicle_manager.service;

import vehicle_manager.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarService {
    List<Car> findAll();
    void add(Car car);
    boolean deleteByControlPlateCar(String controlPlate);
    boolean editByControlPlateCar(String controlPlate);
}
