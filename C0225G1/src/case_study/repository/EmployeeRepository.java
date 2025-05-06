package case_study.repository;

import case_study.model.Employee;
import case_study.utils.ReadAndWriteFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_LIST = "E:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\case_study\\data\\employee.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileToCSV(EMPLOYEE_LIST);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Employee employee = new Employee(array[0], LocalDate.parse(array[1]), array[2], array[3], array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void delete(String id) {
        List<Employee> employeeList = findAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getEmployeeId())){
                employeeList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Employee employee: employeeList){
            stringList.add(employee.toCSV());
        }
        ReadAndWriteFile.writeFileToCSV(EMPLOYEE_LIST, stringList,NOT_APPEND);
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.toCSV());
        ReadAndWriteFile.writeFileToCSV(EMPLOYEE_LIST,stringList,APPEND);
    }

    @Override
    public boolean findId(String id) {
        List<Employee> employeeList = findAll();
        for (Employee employee: employeeList){
            if (employee.getEmployeeId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Employee employee) {
        List<Employee> employeeList = findAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(employee.getEmployeeId())){
                employeeList.set(i, employee);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Employee employees: employeeList){
            stringList.add(employees.toCSV());
        }
        ReadAndWriteFile.writeFileToCSV(EMPLOYEE_LIST,stringList,NOT_APPEND);
    }

    @Override
    public boolean isEmployeeIdExists(String id, List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
