package vehicle_manager.service;

import vehicle_manager.entity.Motorbike;
import vehicle_manager.repository.IMotorbikeRepository;
import vehicle_manager.repository.MotorbikeRepository;

import java.util.ArrayList;

public class MotorbikeService implements IMotorbikeService{
    private IMotorbikeRepository motorbikeRepository = new MotorbikeRepository();
    @Override
    public ArrayList<Motorbike> findAll() {
        return motorbikeRepository.findAll();
    }

    @Override
    public void add(Motorbike motorbike) {
        motorbikeRepository.add(motorbike);
    }

    @Override
    public void deleteByControlPlateMotor(String controlPlate) {
        motorbikeRepository.deleteByControlPlateMotor(controlPlate);
    }
}
