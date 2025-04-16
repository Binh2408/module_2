package vehicle_manager.entity;

public class Motorbike extends Vehicle{
    //công suất
    private int power;

    public Motorbike(int power) {
        this.power = power;
    }

    public Motorbike(String controlPlate, String manufacterName, int manufacterYear, String ownerPerson, int power) {
        super(controlPlate, manufacterName, manufacterYear, ownerPerson);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
