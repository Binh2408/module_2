package test_cuoi_module_2.view;

import test_cuoi_module_2.entity.Bill;
import test_cuoi_module_2.entity.Customer;
import test_cuoi_module_2.entity.CustomerVN;
import test_cuoi_module_2.service.BillService;
import test_cuoi_module_2.service.CustomerService;
import test_cuoi_module_2.service.IBillService;
import test_cuoi_module_2.service.ICustomerService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class BillView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IBillService billService = new BillService();
    private static final ICustomerService customerService = new CustomerService();

    public static void displayBill(List<Bill> billList) {
        for (Bill bill : billList) {
            System.out.println(bill);
        }
    }

    public static Bill inputBill(List<Customer> customerList, List<Bill> billList) {
        System.out.println("Chọn khách hàng: ");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i).getCustomerId() + " - " + customerList.get(i).getName());
        }
        int choice;
        while (true) {
            System.out.println("Nhập số phù hợp: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= customerList.size()) {
                    break;
                } else {
                    System.out.println("Vui lòng chọn từ 1 đến " + customerList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng");
            }
        }
        String customerId = customerList.get(choice - 1).getCustomerId();
        Customer customer = customerList.get(choice - 1);
        // Sinh mã billId mới
        int maxId = 0;
        for (Bill bill : billList) {
            String[] parts = bill.getBillId().split("-");
            int num = Integer.parseInt(parts[1]);
            if (num > maxId) {
                maxId = num;
            }
        }
        String billId = "MHD-" + String.format("%03d", maxId + 1);
        System.out.println("Nhập ngày ra hóa đơn: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);
        System.out.println("Nhập số lượng (số KW tiêu thụ): ");
        double quantity = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập đơn giá: ");
        double unitPrice = Double.parseDouble(scanner.nextLine());
        double total = 0;
        if (customerId.startsWith("KHVN")) {
            // Ép kiểu để lấy định mức
            double limit = ((CustomerVN) customer).getSpentAmount();
            if (quantity <= limit) {
                total = quantity * unitPrice;
            } else {
                double overLimit = quantity - limit;
                total = (limit * unitPrice) + (overLimit * unitPrice * 2.5);
            }
        } else if (customerId.startsWith("KHNN")) {
            total = quantity * unitPrice;
        }
        return new Bill(billId, customerId, date, quantity, unitPrice, total);
    }

    public static String inputBillIdToEdit(List<Bill> billList) {
        displayBill(billList);
        System.out.print("Nhập mã hóa đơn cần chỉnh sửa: ");
        return scanner.nextLine().trim();
    }

    public static Bill updateBill(String billId, List<Bill> billList, List<Customer> customerList) {
        // Tìm hóa đơn cũ
        Bill oldBill = null;
        for (Bill bill : billList) {
            if (bill.getBillId().equals(billId)) {
                oldBill = bill;
                break;
            }
        }

        if (oldBill == null) {
            System.out.println("Mã hóa đơn không tồn tại!");
            return null;
        }

        // Hiển thị danh sách khách hàng
        System.out.println("Danh sách khách hàng:");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i).getCustomerId() + " - " + customerList.get(i).getName());
        }

        // Nhập mã khách hàng mới
        int choice;
        while (true) {
            try {
                System.out.print("Chọn số thứ tự của khách hàng mới: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= customerList.size()) {
                    break;
                } else {
                    System.out.println("⚠ Số không hợp lệ.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠ Nhập sai định dạng.");
            }
        }

        Customer selectedCustomer = customerList.get(choice - 1);
        String newCustomerId = selectedCustomer.getCustomerId();

        // Tính lại tổng tiền nếu là KHVN
        double total = 0;
        if (newCustomerId.startsWith("KHVN")) {
            double limit = ((CustomerVN) selectedCustomer).getSpentAmount();
            if (oldBill.getQuantity() <= limit) {
                total = oldBill.getQuantity() * oldBill.getUnitPrice();
            } else {
                double over = oldBill.getQuantity() - limit;
                total = (limit * oldBill.getUnitPrice()) + (over * oldBill.getUnitPrice() * 2.5);
            }
        } else {
            total = oldBill.getQuantity() * oldBill.getUnitPrice();
        }

        // Trả về hóa đơn đã cập nhật
        return new Bill(
                oldBill.getBillId(),
                newCustomerId,
                oldBill.getInvoiceDate(),
                oldBill.getQuantity(),
                oldBill.getUnitPrice(),
                total
        );
    }


    public static void displayBillDetails() {
        List<Bill> billList = billService.findAll();
        if (billList.isEmpty()) {
            System.out.println("Danh sách hóa đơn trống.");
            return;
        }

        System.out.println("Danh sách hóa đơn:");
        for (Bill bill : billList) {
            System.out.println(bill.toCSV()); // Hiển thị mã hóa đơn, mã khách hàng, loại dịch vụ,...
        }

        System.out.print("Nhập mã hóa đơn cần xem chi tiết: ");
        String billId = scanner.nextLine();

        Bill selectedBill = null;
        for (Bill bill : billList) {
            if (bill.getBillId().equals(billId)) {
                selectedBill = bill;
                break;
            }
        }

        if (selectedBill == null) {
            System.out.println("Không tìm thấy hóa đơn.");
            return;
        }

        // Lấy tên khách hàng từ mã khách hàng
        Customer customer = customerService.findById(selectedBill.getCustomerId());

        System.out.println("\nChi tiết hóa đơn:");
        System.out.println("Mã hóa đơn: " + selectedBill.getBillId());
        System.out.println("Ngày ra hóa đơn: " + selectedBill.getInvoiceDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Số lượng tiêu thụ: " + selectedBill.getQuantity() + " KW");
        System.out.println("Đơn giá: " + selectedBill.getUnitPrice() + " VNĐ");
        System.out.println("Thành tiền: " + selectedBill.getTotalMoney() + " VNĐ");
        System.out.println("\nThông tin khách hàng:");
        if (customer != null) {
            System.out.println("Mã khách hàng  : " + customer.getCustomerId());
            System.out.println("Tên khách hàng : " + customer.getName());
            if (customer instanceof CustomerVN) {
                CustomerVN vn = (CustomerVN) customer;
                System.out.println("Loại khách hàng: Việt Nam");
                System.out.println("Đối tượng      : " + vn.getTypeOfCustomer());
                System.out.println("Định mức       : " + vn.getSpentAmount() + " KW");
            } else {
                System.out.println("Loại khách hàng: Nước ngoài");
                // Ép kiểu để lấy quốc tịch nếu là CustomerForeign
                try {
                    String nationality = (String) customer.getClass().getMethod("getNationality").invoke(customer);
                    System.out.println("Quốc tịch      : " + nationality);
                } catch (Exception e) {
                    System.out.println("Không thể lấy quốc tịch.");
                }
            }
        } else {
            System.out.println("Không tìm thấy thông tin khách hàng.");
        }
    }


}
