package case_study.model;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double usableArea;
    private double rentalCost;
    private int maxPersonQuantity;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, double usableArea, double rentalCost, int maxPersonQuantity, String rentType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxPersonQuantity = maxPersonQuantity;
        this.rentType = rentType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPersonQuantity() {
        return maxPersonQuantity;
    }

    public void setMaxPersonQuantity(int maxPersonQuantity) {
        this.maxPersonQuantity = maxPersonQuantity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxPersonQuantity=" + maxPersonQuantity +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
