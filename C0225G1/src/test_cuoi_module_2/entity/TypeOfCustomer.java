package test_cuoi_module_2.entity;

public class TypeOfCustomer {
    private String typeOfCustomerId;
    private String typeOfCustomerName;

    public TypeOfCustomer() {
    }

    public TypeOfCustomer(String typeOfCustomerId, String typeOfCustomerName) {
        this.typeOfCustomerId = typeOfCustomerId;
        this.typeOfCustomerName = typeOfCustomerName;
    }

    public String getTypeOfCustomerId() {
        return typeOfCustomerId;
    }

    public void setTypeOfCustomerId(String typeOfCustomerId) {
        this.typeOfCustomerId = typeOfCustomerId;
    }

    public String getTypeOfCustomerName() {
        return typeOfCustomerName;
    }

    public void setTypeOfCustomerName(String typeOfCustomerName) {
        this.typeOfCustomerName = typeOfCustomerName;
    }

    @Override
    public String toString() {
        return "TypeOfCustomer{" +
                "typeOfCustomerId='" + typeOfCustomerId + '\'' +
                ", typeOfCustomerName='" + typeOfCustomerName + '\'' +
                '}';
    }

    public String toCSV() {
        return typeOfCustomerId+","+typeOfCustomerName;
    }
}
