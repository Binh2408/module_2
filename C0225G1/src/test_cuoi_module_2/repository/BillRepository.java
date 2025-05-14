package test_cuoi_module_2.repository;

import test_cuoi_module_2.entity.Bill;
import test_cuoi_module_2.utils.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BillRepository implements IBillRepository {
    private final String BILL_LIST = "E:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\test_cuoi_module_2\\data\\hoaDon.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Bill> findAll() {
        List<String> stringList = ReadAndWriteFile.readFileToCSV(BILL_LIST);
        List<Bill> billList = new ArrayList<>();
        String[] array;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (String line : stringList) {
            array = line.split(",");
            Bill bill = new Bill(array[0], array[1], LocalDate.parse(array[2],formatter), Double.parseDouble(array[3]), Double.parseDouble(array[4]), Double.parseDouble(array[5]));
            billList.add(bill);
        }
        return billList;
    }

    @Override
    public void add(Bill bill) {
        List<String> stringList = new ArrayList<>();
        stringList.add(bill.toCSV());
        ReadAndWriteFile.writeFileToCSV(BILL_LIST, stringList, APPEND);
    }

    @Override
    public void updateBill(String billId, Bill updateBill) {
        List<Bill> billList = findAll();
        boolean isUpdated = false;
        for (int i = 0; i < billList.size(); i++) {
            if (billList.get(i).getBillId().equals(billId)) {
                billList.set(i,updateBill);
                isUpdated = true;
                break;
            }
        }

        if (!isUpdated) {
            System.out.println("Hóa đơn không tồn tại.");
            return;
        }
        List<String> updatedList = new ArrayList<>();
        for (Bill bill : billList) {
            updatedList.add(bill.toCSV());
        }
        ReadAndWriteFile.writeFileToCSV(BILL_LIST, updatedList, NOT_APPEND);
    }
}
