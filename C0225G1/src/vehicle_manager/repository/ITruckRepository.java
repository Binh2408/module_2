package vehicle_manager.repository;

import vehicle_manager.entity.Truck;

import java.util.ArrayList;

public interface ITruckRepository {
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void deleteByControlPlateTruck(String controlPlate);
}
