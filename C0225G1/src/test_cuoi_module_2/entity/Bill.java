package test_cuoi_module_2.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bill {
    String billId;
    String customerId;
    LocalDate invoiceDate;
    double quantity;
    double unitPrice;
    double totalMoney;

    public Bill(String billId, String customerId, LocalDate invoiceDate, double quantity, double unitPrice, double totalMoney) {
        this.billId = billId;
        this.customerId = customerId;
        this.invoiceDate = invoiceDate;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalMoney = totalMoney;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Bill{" +
                "billId='" + billId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", invoiceDate=" + invoiceDate.format(formatter) +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalMoney=" + totalMoney +
                '}';
    }

    public String toCSV() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return billId+","+customerId+","+invoiceDate.format(formatter)+","+quantity+","+unitPrice+","+totalMoney;
    }
}


