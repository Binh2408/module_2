package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public boolean findId(int id) {
        return false;
    }

    @Override
    public void update(Customer customer) {

    }
}
