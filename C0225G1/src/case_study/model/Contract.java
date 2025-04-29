package case_study.model;

public class Contract {
    private String contractNumber;
    private String bookingId;
    private double depositAmount;
    private double totalPaymentAmount;

    public Contract() {
    }

    public Contract(String contractNumber, String bookingId, double depositAmount, double totalPaymentAmount) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.depositAmount = depositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                '}';
    }
}
