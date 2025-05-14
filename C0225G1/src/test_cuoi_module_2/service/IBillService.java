package test_cuoi_module_2.service;

import test_cuoi_module_2.entity.Bill;

public interface IBillService extends IService<Bill>{
    void updateBill(String billId, Bill updateBill);
}
