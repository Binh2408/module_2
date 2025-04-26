package ss17_io_binary_file.manager_product_by_character_file.repository;

import ss17_io_binary_file.manager_product_by_binary_file.util.ReadAndWriteFile;
import ss17_io_binary_file.manager_product_by_character_file.entity.Phone;
import ss17_io_binary_file.manager_product_by_character_file.entity.Television;

import java.util.ArrayList;
import java.util.List;

public class TelevisionRepository implements ITelevisionRepository {
    private final String TELEVISION_FILE = "F:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\ss17_io_binary_file\\manager_product_by_character_file\\data\\television.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Television> findAll() {
        List<Television> televisionList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileToCSV(TELEVISION_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Television television = new Television(Integer.parseInt(array[0]),array[1],Double.parseDouble(array[2]),array[3],array[4],Integer.parseInt(array[5]));
            televisionList.add(television);
        }
        return televisionList;
    }

    @Override
    public void delete(int id) {
        List<Television> televisionList = findAll();
        for (int i = 0; i < televisionList.size(); i++) {
            if (televisionList.get(i).getIdProduct() == id){
                televisionList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Television television: televisionList){
            stringList.add(television.getInfoToCSV());
        }
        ReadAndWriteFile.writeFileToCSV(TELEVISION_FILE,stringList,APPEND);
    }

    @Override
    public void add(Television television) {
        List<String> stringList = new ArrayList<>();
        stringList.add(television.getInfoToCSV());
        ReadAndWriteFile.writeFileToCSV(TELEVISION_FILE,stringList,APPEND);
    }

    @Override
    public boolean findId(int id) {
        List<Television> televisionList = findAll();
        for (Television television: televisionList){
            if (television.getIdProduct()== id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Television television) {
        List<Television> televisionList = findAll();
        for (int i = 0; i < televisionList.size(); i++) {
            if(televisionList.get(i).getIdProduct() == television.getIdProduct()){
                televisionList.set(i,television);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Television television1: televisionList){
            stringList.add(television1.getInfoToCSV());
        }
        ReadAndWriteFile.writeFileToCSV(TELEVISION_FILE,stringList,NOT_APPEND);
    }

    @Override
    public List<Television> searchByName(String name) {
        List<Television> televisionList = findAll();
        List<Television> newList = new ArrayList<>();
        for (Television television: televisionList) {
            if (television.getNameProduct().toLowerCase().contains(name.toLowerCase())){
                newList.add(television);
            }
        }
        return newList;
    }

    @Override
    public List<Television> sortByPriceAscending() {
        List<Television> televisionList = findAll();
        List<Television> sortedTelevision = new ArrayList<>(televisionList);
        sortedTelevision.sort((p1,p2)->Double.compare(p1.getPriceProduct(),p2.getPriceProduct()));
        return sortedTelevision;
    }

    @Override
    public List<Television> sortByPriceDescending() {
        List<Television> televisionList = findAll();
        List<Television> sortedTelevision = new ArrayList<>(televisionList);
        sortedTelevision.sort((p1,p2)->Double.compare(p2.getPriceProduct(),p1.getPriceProduct()));
        return sortedTelevision;
    }
}
