package case_study.model;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceId, String serviceName, double usableArea, double rentalCost, int maxPersonQuantity, String rentType, String freeServiceIncluded) {
        super(serviceId, serviceName, usableArea, rentalCost, maxPersonQuantity, rentType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{"+super.toString() +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}


