package case_study.repository;

import case_study.model.Customer;
import case_study.model.Employee;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    boolean isCustomerIdExists(String id, List<Customer> customerList);

}
