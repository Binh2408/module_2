package ss17_io_binary_file.manager_product_by_binary_file.entity;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;
    private String manufactureNameProduct;
    private String descriptionProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double priceProduct, String manufactureNameProduct, String descriptionProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.manufactureNameProduct = manufactureNameProduct;
        this.descriptionProduct = descriptionProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getManufactureNameProduct() {
        return manufactureNameProduct;
    }

    public void setManufactureNameProduct(String manufactureNameProduct) {
        this.manufactureNameProduct = manufactureNameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    @Override
    public String toString() {
        return
                "idProduct=" + idProduct +
                        ", nameProduct='" + nameProduct + '\'' +
                        ", priceProduct=" + priceProduct +
                        ", manufactureNameProduct='" + manufactureNameProduct + '\'' +
                        ", descriptionProduct='" + descriptionProduct + ", ";
    }
    public abstract String getInfoToCSV();
}
