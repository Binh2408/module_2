package test_cuoi_module_2.service;

import test_cuoi_module_2.entity.Customer;
import test_cuoi_module_2.repository.CustomerRepository;
import test_cuoi_module_2.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    private final ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findCustomer(String name) {
        return customerRepository.findCustomer(name);
    }

    @Override
    public Customer findById(String customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public void updateCustomer(String customerId, Customer updateCustomer) {
        customerRepository.updateCustomer(customerId,updateCustomer);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerRepository.deleteCustomer(customerId);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }
}
