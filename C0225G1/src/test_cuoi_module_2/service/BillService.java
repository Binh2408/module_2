package test_cuoi_module_2.service;

import test_cuoi_module_2.entity.Bill;
import test_cuoi_module_2.repository.BillRepository;
import test_cuoi_module_2.repository.IBillRepository;

import java.util.List;

public class BillService implements IBillService{
    private final IBillRepository billRepository = new BillRepository();
    @Override
    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    @Override
    public void add(Bill bill) {
        billRepository.add(bill);
    }

    @Override
    public void updateBill(String billId, Bill updateBill) {
        billRepository.updateBill(billId, updateBill);
    }
}
