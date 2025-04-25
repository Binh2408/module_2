package vehicle_manager.repository;

import vehicle_manager.entity.Car;
import vehicle_manager.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckRepository {
    List<Truck> findAll();
    void add(Truck truck);
    boolean deleteByControlPlateTruck(String controlPlate);
    Truck findByControlPlateTruck(String controlPlate);
    void saveAll(List<Truck> trucks);
    boolean editByControlPlateTruck(String controlPlate);
}
