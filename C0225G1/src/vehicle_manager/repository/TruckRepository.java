package vehicle_manager.repository;

import vehicle_manager.entity.Car;
import vehicle_manager.entity.Truck;
import vehicle_manager.util.ReadAndWriteFile;
import vehicle_manager.view.VehicleView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckRepository implements ITruckRepository {
    private final String TRUCK_FILE = "F:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\vehicle_manager\\data\\truck.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Truck> findAll() {
        List<Truck> truckList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(TRUCK_FILE);
        String[] array;
        for (int i = 0; i < stringList.size();i++) {
            array = stringList.get(i).split(",");
            Truck truck = new Truck(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
            truckList.add(truck);
        }
        return truckList;
    }

    @Override
    public void add(Truck truck) {
        List<String> stringList = new ArrayList<>();
        stringList.add(truck.getInfoToFile());
        ReadAndWriteFile.writeFileCSV(TRUCK_FILE,stringList,APPEND);
    }

    @Override
    public boolean deleteByControlPlateTruck(String controlPlate) {
        List<Truck> truckList = findAll();
        boolean check = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getControlPlate().equals(controlPlate)){
                truckList.remove(i);
                TruckRepository truckRepository = new TruckRepository();
                truckRepository.saveAll(truckList);
                check = true;
                break;
            }
        }
        return check;
    }

    @Override
    public Truck findByControlPlateTruck(String controlPlate) {
        List<Truck> truckList = findAll();
        for (Truck truck: truckList) {
            if (truck.getControlPlate().equals(controlPlate)) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public void saveAll(List<Truck> trucks) {
        List<String> stringList = new ArrayList<>();
        for (Truck truck: trucks) {
            stringList.add(truck.getInfoToFile());
        }
        ReadAndWriteFile.writeFileCSV(TRUCK_FILE,stringList,NOT_APPEND);
    }

    @Override
    public boolean editByControlPlateTruck(String controlPlate) {
        return false;
    }
}
