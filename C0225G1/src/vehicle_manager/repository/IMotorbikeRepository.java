package vehicle_manager.repository;

import vehicle_manager.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeRepository {
    ArrayList<Motorbike> findAll();
    void add(Motorbike motorbike);
    void deleteByControlPlateMotor(String controlPlate);
}
