package test_cuoi_module_2.service;

import test_cuoi_module_2.entity.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer> {
    List<Customer> findCustomer(String name);
    Customer findById(String customerId);
    void updateCustomer(String customerId,  Customer updateCustomer);
    void deleteCustomer(String customerId);
}
