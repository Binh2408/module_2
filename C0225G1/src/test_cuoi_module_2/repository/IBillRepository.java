package test_cuoi_module_2.repository;

import test_cuoi_module_2.entity.Bill;

public interface IBillRepository extends IRepository<Bill> {
    void updateBill(String billId, Bill updateBill);
}
