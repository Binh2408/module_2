package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    private static final IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public boolean findId(int id) {
        return false;
    }

    @Override
    public void update(Employee employee) {

    }
}
