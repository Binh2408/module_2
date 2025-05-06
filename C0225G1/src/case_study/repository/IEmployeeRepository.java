package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    boolean isEmployeeIdExists(String id, List<Employee> employeeList);
}
