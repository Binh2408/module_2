package ss17_io_binary_file.manager_product_by_character_file.entity;

public class Television extends Product {
    private int inch;

    public Television(int inch) {
        this.inch = inch;
    }

    public Television(int idProduct, String nameProduct, double priceProduct, String manufactureNameProduct, String descriptionProduct, int inch) {
        super(idProduct, nameProduct, priceProduct, manufactureNameProduct, descriptionProduct);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Television{" + super.toString() +
                "inch=" + inch +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getIdProduct()+","+super.getNameProduct()+","+super.getManufactureNameProduct()+","+super.getDescriptionProduct()+","+this.getInch();

    }
}
