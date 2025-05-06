package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void delete(String id) {
        employeeRepository.delete(id);
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public boolean findId(String id) {
        return employeeRepository.findId(id);
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.update(employee);
    }

    @Override
    public boolean isEmployeeIdExists(String id, List<Employee> employeeList) {
        return employeeRepository.isEmployeeIdExists(id, employeeRepository.findAll());
    }
}
