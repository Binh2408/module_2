package vehicle_manager.entity;

public class Car extends Vehicle {
    private int numberOfSeats ;
    private String carType;

    public Car(int numberOfSeats, String carType) {
        this.numberOfSeats  = numberOfSeats;
        this.carType = carType;
    }

    public Car(String controlPlate, String manufacterName, int manufacterYear, String ownerPerson, int numberOfSeats, String carType) {
        super(controlPlate, manufacterName, manufacterYear, ownerPerson);
        this.numberOfSeats  = numberOfSeats;
        this.carType = carType;
    }

    public int getSeat() {
        return numberOfSeats ;
    }

    public void setSeat(int seat) {
        this.numberOfSeats  = seat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                ", numberOfSeats=" + numberOfSeats +
                ", carType='" + carType + '\'' +
                '}';
    }

    public String getInfoToFile() {
        return super.getControlPlate()+","+super.getManufacterName()+","+super.getManufacterYear()+","+super.getOwnerPerson()+","+this.getSeat()+","+this.getCarType();
    }

}
