package case_study.model;

import java.time.LocalDate;

public class Employee extends Person{
    private String employeeId;
    private String level;
    private String position;
    private double salary;

    public Employee(String employeeId, String level, String position, double salary) {
        this.employeeId = employeeId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, LocalDate dateOfBirth, String sex, String idCard, String phoneNumber, String email, String employeeId, String level, String position, double salary) {
        super(name, dateOfBirth, sex, idCard, phoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"+super.toString() +
                "employeeId='" + employeeId + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + String.format("%.0f", salary)  +
                '}';
    }
}
