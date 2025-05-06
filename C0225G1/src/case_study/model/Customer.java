package case_study.model;

import java.time.LocalDate;

public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String address;

    public Customer(String name, LocalDate dateOfBirth, String sex, String idCard, String phoneNumber, String email, String customerId, String customerType, String address) {
        super(name, dateOfBirth, sex, idCard, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerId='" + customerId + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String toCSV() {
        return getName() + "," + getDateOfBirth() + "," + getSex() + "," + getIdCard() + "," +
                getPhoneNumber() + "," + getEmail() + "," + customerId + "," + customerType + "," +
                address;
    }
}
