package vehicle_manager.service;

import vehicle_manager.entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();
    void add(Car car);
    void deleteByControlPlateCar(String controlPlate);
}
