package vehicle_manager.service;

import vehicle_manager.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckService {
    List<Truck> findAll();
    void add(Truck truck);
    boolean deleteByControlPlateTruck(String controlPlate);
}
