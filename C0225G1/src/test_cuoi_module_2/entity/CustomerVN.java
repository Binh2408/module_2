package test_cuoi_module_2.entity;

public class CustomerVN extends Customer{
    String typeOfCustomer;
    double spentAmount;

    public CustomerVN(String typeOfCustomer, double spentAmount) {
        this.typeOfCustomer = typeOfCustomer;
        this.spentAmount = spentAmount;
    }

    public CustomerVN(String customerId, String name, String typeOfCustomer, double spentAmount) {
        super(customerId, name);
        this.typeOfCustomer = typeOfCustomer;
        this.spentAmount = spentAmount;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public double getSpentAmount() {
        return spentAmount;
    }

    public void setSpentAmount(double spentAmount) {
        this.spentAmount = spentAmount;
    }

    @Override
    public String toString() {
        return "CustomerVN{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", spentAmount=" + spentAmount +
                '}';
    }

    public String toCSV() {
        return customerId+","+name+","+typeOfCustomer+","+spentAmount;
    }
}
