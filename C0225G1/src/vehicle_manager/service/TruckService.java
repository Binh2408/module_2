package vehicle_manager.service;

import vehicle_manager.entity.Truck;
import vehicle_manager.repository.ITruckRepository;
import vehicle_manager.repository.TruckRepository;

import java.util.ArrayList;

public class TruckService implements ITruckService{
    private ITruckRepository truckRepository = new TruckRepository();
    @Override
    public ArrayList<Truck> findAll() {
        return truckRepository.findAll();
    }

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }

    @Override
    public void deleteByControlPlateTruck(String controlPlate) {
        truckRepository.deleteByControlPlateTruck(controlPlate);
    }
}
