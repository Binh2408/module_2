package test_cuoi_module_2.controller;

import test_cuoi_module_2.common.InputException;
import test_cuoi_module_2.entity.Bill;
import test_cuoi_module_2.entity.Customer;
import test_cuoi_module_2.entity.CustomerNN;
import test_cuoi_module_2.entity.CustomerVN;
import test_cuoi_module_2.service.*;
import test_cuoi_module_2.view.BillView;
import test_cuoi_module_2.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class ManagerController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomerService customerService = new CustomerService();
    private static final IBillService billService = new BillService();
    private static final ITypeOfCustomerService typeOfCustomer = new TypeOfCustomerService();
    public static void displayMainMenu() {
        boolean flagMain = false;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới khách hàng.");
            System.out.println("2. Hiện thị thông tin khách hàng");
            System.out.println("3. Tìm kiếm khách hàng");
            System.out.println("4. Cập nhật khách hàng");
            System.out.println("5. Xóa khách hàng");
            System.out.println("6. Thêm mới hóa đơn");
            System.out.println("7. Chỉnh sửa hóa đơn");
            System.out.println("8. Hiện thị thông  tin chi tiết hóa đơn");
            System.out.println("9. Thoát");

            int choose = InputException.getInput();
            switch (choose) {
                case 1:
                    CustomerController.displayMenuAddNewCustomer();
                    break;
                case 2:
                    CustomerView.displayCustomer(customerService.findAll());
                    break;
                case 3:
                    System.out.println("Nhập tên khách hàng cần tìm: ");
                    String name = CustomerView.inputName();
                    List<Customer> customerList = customerService.findCustomer(name);
                    if(customerList.isEmpty()) {
                        System.out.println("Không tìm thấy");
                    } else {
                        CustomerView.displayCustomer(customerList);
                    }
                    break;
                case 4:
                    System.out.println("Nhập ID khách hàng cần cập nhật: ");
                    String customerIdToUpdate = CustomerView.inputCustomerId();

                    Customer customerToUpdate = customerService.findById(customerIdToUpdate);
                    if (customerToUpdate == null) {
                        System.out.println("Không tìm thấy khách hàng với ID: " + customerIdToUpdate);
                        break;
                    }

                    if (customerToUpdate instanceof CustomerVN) {
                        CustomerVN updatedVN = CustomerView.inputForUpdateCusVN(typeOfCustomer.findAll(), customerIdToUpdate);
                        customerService.updateCustomer(customerIdToUpdate, updatedVN);
                    } else if (customerToUpdate instanceof CustomerNN) {
                        CustomerNN updatedNN = CustomerView.inputForUpdateCusNN(customerIdToUpdate);
                        customerService.updateCustomer(customerIdToUpdate, updatedNN);
                    }

                    System.out.println("Cập nhật thành công!");
                    break;
                case 5:
                    System.out.println("Nhập ID khách hàng cần xóa: ");
                    String customerIdToDelete = CustomerView.inputCustomerId();
                    customerService.deleteCustomer(customerIdToDelete);
                    System.out.println("Xóa thành công");
                    break;
                case 6:
                    List<Customer> customerListAll = customerService.findAll();
                    List<Bill> currentBills = billService.findAll();
                    Bill newBill = BillView.inputBill(customerListAll, currentBills);
                    billService.add(newBill);
                    System.out.println("Đã thêm hóa đơn mới thành công!");
                    break;
                case 7:
                    String billId = BillView.inputBillIdToEdit(billService.findAll());
                    Bill updatedBill = BillView.updateBill(billId, billService.findAll(), customerService.findAll());

                    if (updatedBill != null) {
                        billService.updateBill(billId,updatedBill);
                        System.out.println("Cập nhật hóa đơn thành công!");
                    }
                    break;
                case 8:
//                    BillView.displayBill(billService.findAll());
                    BillView.displayBillDetails();
                    break;
                case 9:
                    flagMain = true;
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1 đến 7");
            }
        } while (!flagMain);
    }
}
