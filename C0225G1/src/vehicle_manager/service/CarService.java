package vehicle_manager.service;

import vehicle_manager.entity.Car;
import vehicle_manager.repository.CarRepository;
import vehicle_manager.repository.ICarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarService implements ICarService {
    private ICarRepository carRepository = new CarRepository();

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }

    @Override
    public boolean deleteByControlPlateCar(String controlPlate) {
        return carRepository.deleteByControlPlateCar(controlPlate);
    }

    @Override
    public boolean editByControlPlateCar(String controlPlate) {
        return false;
    }
}
