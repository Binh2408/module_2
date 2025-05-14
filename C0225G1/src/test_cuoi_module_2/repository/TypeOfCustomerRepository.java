package test_cuoi_module_2.repository;

import test_cuoi_module_2.entity.TypeOfCustomer;
import test_cuoi_module_2.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class TypeOfCustomerRepository implements ITypeOfCustomerRepository {
    private final String TYPE_OF_CUSTOMER_LIST = "E:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\test_cuoi_module_2\\data\\loaiKhach.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<TypeOfCustomer> findAll() {
        List<String> stringList = ReadAndWriteFile.readFileToCSV(TYPE_OF_CUSTOMER_LIST);
        List<TypeOfCustomer> typeOfCustomerList = new ArrayList<>();
        String[] array;
        for (String line : stringList) {
            array = line.split(",");
            TypeOfCustomer typeOfCustomer = new TypeOfCustomer(array[0], array[1]);
            typeOfCustomerList.add(typeOfCustomer);
        }
        return typeOfCustomerList;
    }

    @Override
    public void add(TypeOfCustomer typeOfCustomer) {
        throw new UnsupportedOperationException("Ko hỗ trợ sử dụng");
    }
}
