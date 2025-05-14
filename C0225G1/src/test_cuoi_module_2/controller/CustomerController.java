package test_cuoi_module_2.controller;


import test_cuoi_module_2.common.InputException;
import test_cuoi_module_2.entity.CustomerNN;
import test_cuoi_module_2.entity.CustomerVN;
import test_cuoi_module_2.entity.TypeOfCustomer;
import test_cuoi_module_2.service.CustomerService;
import test_cuoi_module_2.service.ICustomerService;
import test_cuoi_module_2.service.ITypeOfCustomerService;
import test_cuoi_module_2.service.TypeOfCustomerService;
import test_cuoi_module_2.view.CustomerView;

import java.util.List;

public class CustomerController {
    private static final ICustomerService customerService = new CustomerService();
    private static final ITypeOfCustomerService typeOfCustomerService = new TypeOfCustomerService();
    public static void displayMenuAddNewCustomer() {
        boolean flag = false;
        do {
            System.out.println("1. Thêm khách hàng VN");
            System.out.println("2. Thêm khách hàng nước ngoài");
            int choose = InputException.getInput();
            switch (choose) {
                case 1:
                    List<TypeOfCustomer> typeOfCustomerList = typeOfCustomerService.findAll();
                    CustomerVN customerVN = CustomerView.inputCustomerVN(typeOfCustomerList);
                    customerService.add(customerVN);
                    System.out.println("Thêm thành công khách hàng Việt Nam");
                    flag = true;
                    break;
                case 2:
                    CustomerNN customerNN = CustomerView.inputCustomerNN();
                    customerService.add(customerNN);
                    System.out.println("Thêm thành công khách hàng nước ngoài");
                    flag = true;
                    break;

            }
        } while (!flag);
    }
}
