package vehicle_manager.service;

import vehicle_manager.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeService {
    ArrayList<Motorbike> findAll();
    void add(Motorbike motorbike);
    void deleteByControlPlateMotor(String controlPlate);
}
