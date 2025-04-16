package vehicle_manager.repository;

import vehicle_manager.entity.Vehicle;

public class VehicleRepository implements IVehicleRepository {
    private static CarRepository carRepository = new CarRepository();
    private static TruckRepository truckRepository = new TruckRepository();
    private static MotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    public boolean deleteVehicleByControlPlate(String controlPlate) {
        // Xóa trong CarRepository
        for (Vehicle car : carRepository.findAll()) {
            if (car.getControlPlate().equals(controlPlate)) {
                carRepository.deleteByControlPlateCar(controlPlate);
                return true;
            }
        }

        // Xóa trong TruckRepository
        for (Vehicle truck : truckRepository.findAll()) {
            if (truck.getControlPlate().equals(controlPlate)) {
                truckRepository.deleteByControlPlateTruck(controlPlate);
                return true;
            }
        }

        // Xóa trong MotorbikeRepository
        for (Vehicle motorbike : motorbikeRepository.findAll()) {
            if (motorbike.getControlPlate().equals(controlPlate)) {
                motorbikeRepository.deleteByControlPlateMotor(controlPlate);
                return true;
            }
        }

        // Không tìm thấy phương tiện
        return false;
    }

}
