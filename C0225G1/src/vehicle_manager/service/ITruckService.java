package vehicle_manager.service;

import vehicle_manager.entity.Truck;

import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void deleteByControlPlateTruck(String controlPlate);
}
