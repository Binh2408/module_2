package case_study.view;

import case_study.common.EmployeeValidate;
import case_study.common.LevelOfEmployeeList;
import case_study.common.PositionOfEmployeeList;
import case_study.model.Employee;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);

    public static Employee inputEmployee() {
        String name, sex, idCard, phoneNumber, email, employeeId, level, position;
        LocalDate date;
        double salary;

        // Nhập tên
        while (true) {
            try {
                System.out.println("Enter name employee: ");
                name = scanner.nextLine();
                EmployeeValidate.validateName(name);
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
                EmployeeValidate.validateAge(date);
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
                EmployeeValidate.validateCmnd(idCard);
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
                EmployeeValidate.validatePhone(phoneNumber);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập email
        System.out.println("Enter email: ");
        email = scanner.nextLine();

        // Nhập mã nhân viên
        while (true) {
            try {
                System.out.println("Enter employee id: ");
                employeeId = scanner.nextLine();
                EmployeeValidate.validateId(employeeId);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Chọn level
        System.out.println("Enter level: ");
        for (int i = 0; i < LevelOfEmployeeList.levelList.size(); i++) {
            System.out.println((i + 1) + ". " + LevelOfEmployeeList.levelList.get(i));
        }
        int choiceLevel;
        while (true) {
            System.out.print("Enter number match with your level: ");
            try {
                choiceLevel = Integer.parseInt(scanner.nextLine());
                if (choiceLevel >= 1 && choiceLevel <= LevelOfEmployeeList.levelList.size()) {
                    break;
                } else {
                    System.out.println("Enter number form 1 to " + LevelOfEmployeeList.levelList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        }
        level = LevelOfEmployeeList.levelList.get(choiceLevel - 1);

        // Chọn position
        System.out.println("Enter position: ");
        for (int i = 0; i < PositionOfEmployeeList.positionList.size(); i++) {
            System.out.println((i + 1) + ". " + PositionOfEmployeeList.positionList.get(i));
        }
        int choicePosition;
        while (true) {
            System.out.print("Enter number match with your level: ");
            try {
                choicePosition = Integer.parseInt(scanner.nextLine());
                if (choicePosition >= 1 && choicePosition <= PositionOfEmployeeList.positionList.size()) {
                    break;
                } else {
                    System.out.println("Enter number form 1 to " + PositionOfEmployeeList.positionList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        }
        position = PositionOfEmployeeList.positionList.get(choicePosition - 1);

        // Nhập lương
        while (true) {
            try {
                System.out.println("Enter salary: ");
                salary = Double.parseDouble(scanner.nextLine());
                EmployeeValidate.validateSalary(salary);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return new Employee(name, date, sex, idCard, phoneNumber, email, employeeId, level, position, salary);
    }


    public static String inputID() {
        System.out.println("Enter ID employee: ");
        return scanner.nextLine().trim();
    }

    public static Employee inputForUpdateEmployee(String employeeId) {
        String name, sex, idCard, phoneNumber, email, level, position;
        LocalDate date;
        double salary;

        // Nhập tên
        while (true) {
            try {
                System.out.println("Enter name employee: ");
                name = scanner.nextLine();
                EmployeeValidate.validateName(name);
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
                EmployeeValidate.validateAge(date);
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
                EmployeeValidate.validateCmnd(idCard);
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
                EmployeeValidate.validatePhone(phoneNumber);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập email
        System.out.println("Enter email: ");
        email = scanner.nextLine();

        // Chọn level
        System.out.println("Enter level: ");
        for (int i = 0; i < LevelOfEmployeeList.levelList.size(); i++) {
            System.out.println((i + 1) + ". " + LevelOfEmployeeList.levelList.get(i));
        }
        int choiceLevel;
        while (true) {
            System.out.print("Enter number match with your level: ");
            try {
                choiceLevel = Integer.parseInt(scanner.nextLine());
                if (choiceLevel >= 1 && choiceLevel <= LevelOfEmployeeList.levelList.size()) {
                    break;
                } else {
                    System.out.println("Enter number form 1 to " + LevelOfEmployeeList.levelList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        }
        level = LevelOfEmployeeList.levelList.get(choiceLevel - 1);

        // Chọn position
        System.out.println("Enter position: ");
        for (int i = 0; i < PositionOfEmployeeList.positionList.size(); i++) {
            System.out.println((i + 1) + ". " + PositionOfEmployeeList.positionList.get(i));
        }
        int choicePosition;
        while (true) {
            System.out.print("Enter number match with your position: ");
            try {
                choicePosition = Integer.parseInt(scanner.nextLine());
                if (choicePosition >= 1 && choicePosition <= PositionOfEmployeeList.positionList.size()) {
                    break;
                } else {
                    System.out.println("Enter number from 1 to " + PositionOfEmployeeList.positionList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        }
        position = PositionOfEmployeeList.positionList.get(choicePosition - 1);

        // Nhập lương
        while (true) {
            try {
                System.out.println("Enter salary: ");
                salary = Double.parseDouble(scanner.nextLine());
                EmployeeValidate.validateSalary(salary);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Salary format is wrong. Please enter a valid number.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return new Employee(name, date, sex, idCard, phoneNumber, email, employeeId, level, position, salary);
    }


}
