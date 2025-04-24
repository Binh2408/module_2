package vehicle_manager.service;

import vehicle_manager.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public interface IMotorbikeService {
    List<Motorbike> findAll();
    void add(Motorbike motorbike);
    boolean deleteByControlPlateMotor(String controlPlate);
}
