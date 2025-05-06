package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    private static final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void delete(String id) {
        customerRepository.delete(id);
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public boolean findId(String id) {
        return customerRepository.findId(id);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);
    }

    @Override
    public boolean isCustomerIdExists(String id, List<Customer> customerList) {
        return customerRepository.isCustomerIdExists(id,customerRepository.findAll());
    }
}
