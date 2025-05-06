package case_study.service;

import case_study.model.Customer;
import case_study.model.Employee;

import java.util.List;

public interface ICustomerService extends IService<Customer>{
    boolean isCustomerIdExists(String id, List<Customer> customerList);

}
