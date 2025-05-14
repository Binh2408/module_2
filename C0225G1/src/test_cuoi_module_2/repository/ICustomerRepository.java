package test_cuoi_module_2.repository;

import test_cuoi_module_2.entity.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    List<Customer> findCustomer(String name);
    Customer findById(String customerId);
    void updateCustomer(String customerId,  Customer updateCustomer);
    void deleteCustomer(String customerId);
}
