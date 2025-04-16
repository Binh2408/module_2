package vehicle_manager.service;

import vehicle_manager.entity.Car;
import vehicle_manager.repository.CarRepository;
import vehicle_manager.repository.ICarRepository;

import java.util.ArrayList;

public class CarService implements ICarService {
    private ICarRepository carRepository = new CarRepository();

    @Override
    public ArrayList<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }

    @Override
    public void deleteByControlPlateCar(String controlPlate) {
        carRepository.deleteByControlPlateCar(controlPlate);
    }
}
