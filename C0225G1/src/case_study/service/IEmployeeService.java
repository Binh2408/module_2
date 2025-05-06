package case_study.service;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee> {
    boolean isEmployeeIdExists(String id, List<Employee> employeeList);

}
