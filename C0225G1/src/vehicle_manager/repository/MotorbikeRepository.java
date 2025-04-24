package vehicle_manager.repository;

import vehicle_manager.entity.Car;
import vehicle_manager.entity.Motorbike;
import vehicle_manager.util.ReadAndWriteFile;
import vehicle_manager.view.VehicleView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeRepository implements IMotorbikeRepository {
    private final String MOTOR_FILE = "F:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\vehicle_manager\\data\\motorbike.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;


    @Override
    public List<Motorbike> findAll() {
        List<Motorbike> motorbikesList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(MOTOR_FILE);
        String[] array;
        for (int i = 0; i < stringList.size();i++){
            array = stringList.get(i).split(",");
            Motorbike motorbike = new Motorbike(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
            motorbikesList.add(motorbike);
        }
        return motorbikesList;
    }

    @Override
    public void add(Motorbike motorbike) {
        List<String> stringList = new ArrayList<>();
        stringList.add(motorbike.getInfoToFile());
        ReadAndWriteFile.writeFileCSV(MOTOR_FILE,stringList,APPEND);
    }

    @Override
    public boolean deleteByControlPlateMotor(String controlPlate) {
        List<Motorbike> motorbikesList = findAll();
        boolean check = false;
        for (int i = 0; i < motorbikesList.size(); i++) {
            if (motorbikesList.get(i).getControlPlate().equals(controlPlate)) {
                motorbikesList.remove(i);
                    MotorbikeRepository motorbikeRepository = new MotorbikeRepository();
                    motorbikeRepository.saveAll(motorbikesList);
                    check = true;
                    break;
            }
        }
        return check;
    }

    @Override
    public Motorbike findByControlPlateMotor(String controlPlate) {
        List<Motorbike> motorbikesList = findAll();
        for (Motorbike motorbike: motorbikesList){
            if (motorbike.getControlPlate().equals(controlPlate)){
                return motorbike;
            }
        }
        return null;
    }

    @Override
    public void saveAll(List<Motorbike> motorbikes) {
        List<String> stringList = new ArrayList<>();
        for (Motorbike motorbike: motorbikes){
            stringList.add(motorbike.getInfoToFile());
        }
        ReadAndWriteFile.writeFileCSV(MOTOR_FILE,stringList,NOT_APPEND);
    }
}
