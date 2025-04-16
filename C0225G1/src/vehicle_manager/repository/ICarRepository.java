package vehicle_manager.repository;

import vehicle_manager.entity.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> findAll();
    void add(Car car);
    void deleteByControlPlateCar(String controlPlate);
}
