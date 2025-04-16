package vehicle_manager.repository;

import vehicle_manager.entity.Motorbike;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeRepository implements IMotorbikeRepository {
    private static ArrayList<Motorbike> motorbikes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        motorbikes.add(new Motorbike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
        motorbikes.add(new Motorbike(" 43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150));
        motorbikes.add(new Motorbike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50));
    }

    @Override
    public ArrayList<Motorbike> findAll() {
        return new ArrayList<>(motorbikes);
    }

    @Override
    public void add(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    @Override
    public void deleteByControlPlateMotor(String controlPlate) {
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getControlPlate().equals(controlPlate)) {
                System.out.println("Bạn có muốn xóa hay không?(CÓ/KHÔNG)");
                String result = scanner.nextLine();
                if (result.equalsIgnoreCase("CÓ")) {
                    motorbikes.remove(i);
                    System.out.println("Xóa thành công!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy biển kiểm soát!");
    }
}
