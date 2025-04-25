package ss17_io_binary_file.manager_product_by_binary_file.repository;

import ss17_io_binary_file.manager_product_by_binary_file.entity.Phone;
import ss17_io_binary_file.manager_product_by_binary_file.repository.IPhoneRepository;
import ss17_io_binary_file.manager_product_by_binary_file.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository implements IPhoneRepository {
    private final String PHONE_FILE = "F:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\ss17_io_binary_file\\manager_product_by_binary_file\\data\\phone.csv";
    private final String PHONE_DAT_FILE = "F:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\ss17_io_binary_file\\manager_product_by_binary_file\\data\\phone.dat";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public List<Phone> findAll() {
        List<Phone> phoneList = new ArrayList<>();
//        List<String> stringList = ReadAndWriteFile.readFileToCSV(PHONE_FILE);
//        String[] array;
//        for (int i = 0; i < stringList.size(); i++) {
//            array = stringList.get(i).split(",");
//            Phone phone = new Phone(Integer.parseInt(array[0]),array[1],Double.parseDouble(array[2]),array[3],array[4], array[5]);
//            phoneList.add(phone);
//        }
        phoneList = ReadAndWriteFile.readBinaryFileToListPhone(PHONE_DAT_FILE);
        return phoneList;
    }

    @Override
    public void delete(int id) {
        List<Phone> phoneList = findAll();
        for(int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getIdProduct() == id) {
                phoneList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Phone phone: phoneList){
            stringList.add(phone.getInfoToCSV());
        }
        ReadAndWriteFile.writeFileToCSV(PHONE_FILE,stringList,NOT_APPEND);

    }

    @Override
    public void add(Phone phone) {
        //character
//        List<String> stringList = new ArrayList<>();
//        stringList.add(phone.getInfoToCSV());
//        ReadAndWriteFile.writeFileToCSV(PHONE_FILE,stringList,APPEND);
        //binary
        List<Phone> phoneList = ReadAndWriteFile.readBinaryFileToListPhone(PHONE_DAT_FILE);
        phoneList.add(phone);
        ReadAndWriteFile.writeListPhoneToBinaryFile(PHONE_DAT_FILE,phoneList);
    }

    @Override
    public boolean findId(int id) {
        List<Phone> phoneList = findAll();
        for(Phone phone: phoneList){
            if (phone.getIdProduct() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Phone phone) {
        List<Phone> phoneList = findAll();
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getIdProduct() == phone.getIdProduct()) {
                phoneList.set(i,phone);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Phone phones: phoneList){
            stringList.add(phones.getInfoToCSV());
        }
        ReadAndWriteFile.writeFileToCSV(PHONE_FILE,stringList,NOT_APPEND);
    }

    @Override
    public List<Phone> searchByName(String name) {
        List<Phone> phoneList = findAll();
        List<Phone> newList = new ArrayList<>();
        for (Phone phone: phoneList) {
            if (phone.getNameProduct().toLowerCase().contains(name.toLowerCase())){
                newList.add(phone);
            }
        }
        return newList;
    }

    @Override
    public List<Phone> sortByPriceAscending() {
        List<Phone> phoneList = findAll();
        List<Phone> sortedPhone = new ArrayList<>(phoneList);
        sortedPhone.sort((p1,p2) -> Double.compare(p1.getPriceProduct(),p2.getPriceProduct()));
        return sortedPhone;
    }

    @Override
    public List<Phone> sortByPriceDescending() {
        List<Phone> phoneList = findAll();
        List<Phone> sortedList = new ArrayList<>(phoneList); // tạo bản sao mới
        sortedList.sort((p1, p2) -> Double.compare(p2.getPriceProduct(), p1.getPriceProduct()));
        return sortedList;
    }

}
