package test_cuoi_module_2.entity;

public class CustomerNN extends Customer {
    String national;

    public CustomerNN(String national) {
        this.national = national;
    }

    public CustomerNN(String customerId, String name, String national) {
        super(customerId, name);
        this.national = national;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return "CustomerNN{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", national='" + national + '\'' +
                '}';
    }

    public String toCSV() {
        return customerId+","+name+","+national;
    }
}
