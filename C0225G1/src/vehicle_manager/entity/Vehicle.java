package vehicle_manager.entity;

public class Vehicle {
    //biển kiểm soát
    private String controlPlate;
    //hãng sản xuất
    private String manufacterName;
    //năm sản xuất
    private int manufacterYear;
    //chủ sở hữu
    private String ownerPerson;

    public Vehicle() {
    }

    public Vehicle(String controlPlate, String manufacterName, int manufacterYear, String ownerPerson) {
        this.controlPlate = controlPlate;
        this.manufacterName = manufacterName;
        this.manufacterYear = manufacterYear;
        this.ownerPerson = ownerPerson;
    }

    public String getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(String controlPlate) {
        this.controlPlate = controlPlate;
    }

    public String getManufacterName() {
        return manufacterName;
    }

    public void setManufacterName(String manufacterName) {
        this.manufacterName = manufacterName;
    }

    public int getManufacterYear() {
        return manufacterYear;
    }

    public void setManufacterYear(int manufacterYear) {
        this.manufacterYear = manufacterYear;
    }

    public String getOwnerPerson() {
        return ownerPerson;
    }

    public void setOwnerPerson(String ownerPerson) {
        this.ownerPerson = ownerPerson;
    }

    @Override
    public String toString() {
        return "controlPlate='" + controlPlate + '\'' +
                ", manufacterName='" + manufacterName + '\'' +
                ", manufacterYear=" + manufacterYear +
                ", ownerPerson='" + ownerPerson + '\'';
    }

}
