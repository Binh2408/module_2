package case_study.model;

public class House extends Facility{
    private String roomStandard;
    private int floorNumber;

    public House(String roomStandard, int floorNumber) {
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public House(String serviceId, String serviceName, double usableArea, double rentalCost, int maxPersonQuantity, String rentType, String roomStandard, int floorNumber) {
        super(serviceId, serviceName, usableArea, rentalCost, maxPersonQuantity, rentType);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{"+super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
