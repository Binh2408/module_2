package case_study.repository;

import case_study.model.Customer;
import case_study.utils.ReadAndWriteFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private final String CUSTOMER_LIST = "E:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\case_study\\data\\customer.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileToCSV(CUSTOMER_LIST);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Customer customer = new Customer(array[0],LocalDate.parse(array[1]),array[2],array[3],array[4],array[5],array[6],array[7],array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void delete(String id) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (id.equals(customerList.get(i).getCustomerId())){
                customerList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer customer: customerList){
            stringList.add(customer.toCSV());
        }
        ReadAndWriteFile.writeFileToCSV(CUSTOMER_LIST,stringList,NOT_APPEND);
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.toCSV());
        ReadAndWriteFile.writeFileToCSV(CUSTOMER_LIST,stringList,APPEND);
    }

    @Override
    public boolean findId(String id) {
        List<Customer> customerList = findAll();
        for (Customer customer: customerList){
            if (id.equals(customer.getCustomerId())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Customer customer) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId().equals(customer.getCustomerId())){
                customerList.set(i, customer);
            }
        }
        List<String> stringList = new ArrayList<>();
        for(Customer customer1: customerList){
            stringList.add(customer1.toCSV());
        }
        ReadAndWriteFile.writeFileToCSV(CUSTOMER_LIST,stringList,NOT_APPEND);
    }

    @Override
    public boolean isCustomerIdExists(String id, List<Customer> customerList) {
        for (Customer customer: customerList){
            if (customer.getCustomerId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
