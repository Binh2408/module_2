package vehicle_manager.repository;

import vehicle_manager.entity.Car;
import vehicle_manager.util.ReadAndWriteFile;
import vehicle_manager.view.CarView;

import java.util.ArrayList;
import java.util.List;


public class CarRepository implements ICarRepository {
    private final String CAR_FILE = "F:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\vehicle_manager\\data\\car.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(CAR_FILE);
        String[] array;
        for (int i = 0; i < stringList.size();i++) {
            array = stringList.get(i).split(",");
            Car car = new Car(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]),array[5]);
            carList.add(car);
        }
        return carList;
    }

    @Override
    public void add(Car car) {
        List<String> stringList = new ArrayList<>();
        stringList.add(car.getInfoToFile());
        ReadAndWriteFile.writeFileCSV(CAR_FILE,stringList,APPEND);
        //cars.add(car);
    }

    @Override
    public boolean deleteByControlPlateCar(String controlPlate) {
        List<Car> cars = findAll();
        boolean check = false;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getControlPlate().equals(controlPlate)) {
                    cars.remove(i);
                    CarRepository carRepository = new CarRepository();
                    carRepository.saveAll(cars);
                    check = true;
                    break;
            }
        }
        return check;
    }

    @Override
    public Car findByControlPlateCar(String controlPlate) {
        List<Car> cars = findAll();
        for (Car car: cars) {
            if (car.getControlPlate().equals(controlPlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void saveAll(List<Car> cars) {
        List<String> stringList = new ArrayList<>();
        for (Car car: cars) {
            stringList.add(car.getInfoToFile());
        }
        ReadAndWriteFile.writeFileCSV(CAR_FILE,stringList,NOT_APPEND);
    }

    @Override
    public boolean editByControlPlateCar(String controlPlate) {
        List<Car> stringList = findAll();
        Car car = findByControlPlateCar(controlPlate);
        if (car == null) {
            System.out.println("Ko tìm thấy sản phẩm có biển kiểm soát: " + controlPlate);
            return false;
        }
        Car updateCar = CarView.inputDataForCar();
        car.setControlPlate(updateCar.getControlPlate());
        car.setManufacterName(updateCar.getManufacterName());
        car.setManufacterYear(updateCar.getManufacterYear());
        car.setOwnerPerson(updateCar.getOwnerPerson());
        car.setSeat(updateCar.getSeat());
        car.setCarType(updateCar.getCarType());
        for (int i = 0; i < stringList.size(); i++) {
            if (car.getControlPlate().equals(stringList.get(i).getControlPlate())) {
                stringList.get(i).setControlPlate(car.getControlPlate());
                stringList.get(i).setManufacterName(car.getManufacterName());
                stringList.get(i).setManufacterYear(car.getManufacterYear());
                stringList.get(i).setOwnerPerson(car.getOwnerPerson());
                stringList.get(i).setSeat(car.getSeat());
                stringList.get(i).setCarType(car.getCarType());
                CarRepository carRepository = new CarRepository();
                carRepository.saveAll(stringList);
                return true;
            }
        }
        return false;
    }
}
