package test_cuoi_module_2.view;

import test_cuoi_module_2.entity.Customer;
import test_cuoi_module_2.entity.CustomerNN;
import test_cuoi_module_2.entity.CustomerVN;
import test_cuoi_module_2.entity.TypeOfCustomer;
import test_cuoi_module_2.utils.ReadAndWriteFile;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayCustomer(List<Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static CustomerVN inputCustomerVN(List<TypeOfCustomer> typeOfCustomerList) {
        String customerId;
        while (true) {
            try {
                System.out.println("Nhập ID khách hàng Việt Nam: ");
                customerId = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        String name;
        while (true) {
            try {
                System.out.println("Nhập tên: ");
                name = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Loại khách hàng: ");
        for (int i = 0; i < typeOfCustomerList.size(); i++) {
            System.out.println((i + 1) + ". " + typeOfCustomerList.get(i).toCSV());
        }
        int choice;
        while (true) {
            System.out.println("Nhập số phù hợp: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= typeOfCustomerList.size()) {
                    break;
                } else {
                    System.out.println("Vui lòng chọn từ 1 đến " + typeOfCustomerList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng");
            }
        }
        String typeOfCustomer = typeOfCustomerList.get(choice - 1).getTypeOfCustomerName();

        System.out.println("Nhập định mức tiêu thụ: ");
        double spentAmount = Double.parseDouble(scanner.nextLine());

        return new CustomerVN(customerId, name, typeOfCustomer, spentAmount);
    }

    public static CustomerNN inputCustomerNN() {
        String customerId;
        while (true) {
            try {
                System.out.println("Nhập ID khách hàng nước ngoài: ");
                customerId = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        String name;
        while (true) {
            try {
                System.out.println("Nhập tên: ");
                name = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        String national;
        while (true) {
            try {
                System.out.println("Nhập quốc gia: ");
                national = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return new CustomerNN(customerId, name, national);
    }

    public static String inputName() {
        return scanner.nextLine();
    }

    public static String inputCustomerId() {
        return scanner.nextLine();
    }

    public static CustomerVN inputForUpdateCusVN(List<TypeOfCustomer> typeOfCustomerList, String customerId) {
        System.out.println("Cập nhật thông tin khách hàng Việt Nam - ID: " + customerId);

        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();

        System.out.println("Chọn loại khách hàng mới:");
        for (int i = 0; i < typeOfCustomerList.size(); i++) {
            System.out.println((i + 1) + ". " + typeOfCustomerList.get(i).toCSV());
        }

        int choice;
        while (true) {
            System.out.print("Nhập số tương ứng: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= typeOfCustomerList.size()) {
                    break;
                } else {
                    System.out.println("Vui lòng chọn từ 1 đến " + typeOfCustomerList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng. Vui lòng nhập số.");
            }
        }

        String typeOfCustomer = typeOfCustomerList.get(choice - 1).getTypeOfCustomerName();

        System.out.print("Nhập định mức tiêu thụ mới: ");
        double spentAmount = Double.parseDouble(scanner.nextLine());

        return new CustomerVN(customerId, name, typeOfCustomer, spentAmount);
    }

    public static CustomerNN inputForUpdateCusNN(String customerId) {
        System.out.println("Cập nhật thông tin khách hàng nước ngoài - ID: " + customerId);

        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();

        System.out.print("Nhập quốc tịch mới: ");
        String national = scanner.nextLine();

        return new CustomerNN(customerId, name, national);
    }
}


