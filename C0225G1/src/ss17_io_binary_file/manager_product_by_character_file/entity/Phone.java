package ss17_io_binary_file.manager_product_by_character_file.entity;

public class Phone extends Product {
    private String manufactureYear;

    public Phone(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Phone(int idProduct, String nameProduct, double priceProduct, String manufactureNameProduct, String descriptionProduct, String manufactureYear) {
        super(idProduct, nameProduct, priceProduct, manufactureNameProduct, descriptionProduct);
        this.manufactureYear = manufactureYear;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Phone{" + super.toString() +
                "manufactureYear=" + manufactureYear +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getIdProduct()+","+super.getNameProduct()+","+super.getPriceProduct()+","+super.getManufactureNameProduct()+","+super.getDescriptionProduct()+","+this.getManufactureYear();
    }

}
