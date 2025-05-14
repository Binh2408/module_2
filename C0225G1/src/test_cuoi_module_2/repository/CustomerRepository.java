package test_cuoi_module_2.repository;

import test_cuoi_module_2.entity.Customer;
import test_cuoi_module_2.entity.CustomerNN;
import test_cuoi_module_2.entity.CustomerVN;
import test_cuoi_module_2.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_LIST = "E:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\test_cuoi_module_2\\data\\customer.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Customer> findCustomer(String name) {
        List<Customer> customerList = findAll();
        List<Customer> newCustomerList = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getName().toLowerCase().trim().contains(name.toLowerCase())) {
                newCustomerList.add(customer);
            }
        }
        return newCustomerList;
    }

    @Override
    public Customer findById(String customerId) {
        List<Customer> customerList = findAll();
        for (Customer customer : customerList) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void updateCustomer(String customerId, Customer updateCustomer) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId().equals(customerId)) {
                customerList.set(i, updateCustomer);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.toCSV());
        }
        ReadAndWriteFile.writeFileToCSV(CUSTOMER_LIST, stringList, NOT_APPEND);
    }

    @Override
    public void deleteCustomer(String customerId) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId().equals(customerId)) {
                customerList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.toCSV());
        }
        ReadAndWriteFile.writeFileToCSV(CUSTOMER_LIST, stringList, NOT_APPEND);

    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileToCSV(CUSTOMER_LIST);
        String[] array;
        for (String line : stringList) {
            array = line.split(",");
            Customer customer = null;
            if (array[0].startsWith("KHVN")) {
                customer = new CustomerVN(array[0], array[1], array[2], Double.parseDouble(array[3]));
            } else if (array[0].startsWith("KHNN")) {
                customer = new CustomerNN(array[0], array[1], array[2]);
            }
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.toCSV());
        ReadAndWriteFile.writeFileToCSV(CUSTOMER_LIST, stringList, APPEND);
    }
}
