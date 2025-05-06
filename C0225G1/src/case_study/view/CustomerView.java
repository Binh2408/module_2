package case_study.view;

import case_study.common.CustomerValidate;
import case_study.common.EmployeeValidate;
import case_study.common.LevelOfEmployeeList;
import case_study.common.TypeOfCustomer;
import case_study.model.Customer;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);

    public static Customer inputCustomer() {
        String name, sex, idCard, phoneNumber, email, customerId, customerType, address;
        LocalDate date;
        //nhập tên
        while (true) {
            try {
                System.out.println("Enter name customer: ");
                name = scanner.nextLine();
                CustomerValidate.validateName(name);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        // Nhập ngày sinh
        while (true) {
            try {
                System.out.println("Enter date of birth (yyyy-MM-dd): ");
                date = LocalDate.parse(scanner.nextLine());
                CustomerValidate.validateAge(date);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập giới tính
        System.out.println("Enter sex: ");
        sex = scanner.nextLine();

        // Nhập CMND
        while (true) {
            try {
                System.out.println("Enter id card: ");
                idCard = scanner.nextLine();
                CustomerValidate.validateCmnd(idCard);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập số điện thoại
        while (true) {
            try {
                System.out.println("Enter phone number: ");
                phoneNumber = scanner.nextLine();
                CustomerValidate.validatePhone(phoneNumber);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập email
        System.out.println("Enter email: ");
        email = scanner.nextLine();
        // Nhập mã khách hàng
        while (true) {
            try {
                System.out.println("Enter customer id: ");
                customerId = scanner.nextLine();
                CustomerValidate.validateId(customerId);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        //Chọn loại khách hàng
        System.out.println("Enter customer Type: ");
        for (int i = 0; i < TypeOfCustomer.typeOfCustomer.size(); i++) {
            System.out.println((i + 1) + ". " + TypeOfCustomer.typeOfCustomer.get(i));
        }
        int choiceLevel;
        while (true) {
            System.out.print("Enter number match with your level: ");
            try {
                choiceLevel = Integer.parseInt(scanner.nextLine());
                if (choiceLevel >= 1 && choiceLevel <= TypeOfCustomer.typeOfCustomer.size()) {
                    break;
                } else {
                    System.out.println("Enter number form 1 to " + TypeOfCustomer.typeOfCustomer.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        }
        customerType = TypeOfCustomer.typeOfCustomer.get(choiceLevel - 1);
        System.out.println("Enter address: ");
        address = scanner.nextLine();
        return new Customer(name, date, sex, idCard, phoneNumber, email, customerId, customerType, address);
    }

    public static String inputID() {
        System.out.println("Enter ID customer: ");
        return scanner.nextLine().trim();
    }

    public static Customer inputForUpdateCUstomer(String customerId) {
        String name, sex, idCard, phoneNumber, email, customerType, address;
        LocalDate date;
        //nhập tên
        while (true) {
            try {
                System.out.println("Enter name customer: ");
                name = scanner.nextLine();
                CustomerValidate.validateName(name);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        // Nhập ngày sinh
        while (true) {
            try {
                System.out.println("Enter date of birth (yyyy-MM-dd): ");
                date = LocalDate.parse(scanner.nextLine());
                CustomerValidate.validateAge(date);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập giới tính
        System.out.println("Enter sex: ");
        sex = scanner.nextLine();

        // Nhập CMND
        while (true) {
            try {
                System.out.println("Enter id card: ");
                idCard = scanner.nextLine();
                CustomerValidate.validateCmnd(idCard);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập số điện thoại
        while (true) {
            try {
                System.out.println("Enter phone number: ");
                phoneNumber = scanner.nextLine();
                CustomerValidate.validatePhone(phoneNumber);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập email
        System.out.println("Enter email: ");
        email = scanner.nextLine();

        //Chọn loại khách hàng
        System.out.println("Enter customer Type: ");
        for (int i = 0; i < TypeOfCustomer.typeOfCustomer.size(); i++) {
            System.out.println((i + 1) + ". " + TypeOfCustomer.typeOfCustomer.get(i));
        }
        int choiceLevel;
        while (true) {
            System.out.print("Enter number match with your level: ");
            try {
                choiceLevel = Integer.parseInt(scanner.nextLine());
                if (choiceLevel >= 1 && choiceLevel <= TypeOfCustomer.typeOfCustomer.size()) {
                    break;
                } else {
                    System.out.println("Enter number form 1 to " + TypeOfCustomer.typeOfCustomer.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        }
        customerType = TypeOfCustomer.typeOfCustomer.get(choiceLevel - 1);
        System.out.println("Enter address: ");
        address = scanner.nextLine();
        return new Customer(name, date, sex, idCard, phoneNumber, email, customerId, customerType, address);
    }
}
