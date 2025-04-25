package vehicle_manager.entity;

public class Truck extends Vehicle{
    private int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(String controlPlate, String manufacterName, int manufacterYear, String ownerPerson, int weight) {
        super(controlPlate, manufacterName, manufacterYear, ownerPerson);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return super.toString() + ", weight=" + weight + " tấn";
    }

    public String getInfoToFile() {
        return super.getControlPlate()+","+super.getManufacterName()+","+super.getManufacterYear()+","+super.getOwnerPerson()+","+this.getWeight();

    }

}
