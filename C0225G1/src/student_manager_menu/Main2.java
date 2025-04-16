package student_manager_menu;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        do {
            System.out.println("--------------------Menu--------------------");
            System.out.println("1. Display All Students");
            System.out.println("2. Add New Students");
            System.out.println("3. Delete Students");
            System.out.println("4. Edit Students");
            System.out.println("5. Search Students in lists");
            System.out.println("6. Exit");
            System.out.println("--------------------------------------------");
            int choice;
            // Nhập lựa chọn có kiểm tra lỗi
            while (true) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 6) {
                        break; // hợp lệ, thoát vòng lặp nhập
                    } else {
                        System.out.println("Please enter a number from 1 to 6.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                }
            }
            if (choice == 6) {
                System.out.println("See you again!!!");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("List of students");
                    manager.display();
                    break;
                case 2:
                    System.out.println("Add New Student");
                    manager.add();
                    break;
                case 3:
                    System.out.println("Delete Students");
                    manager.delete();
                    break;
                case 4:
                    System.out.println("Edit Students");
                    manager.edit();
                    break;
                case 5:
                    System.out.println("Search Student");
                    manager.search();
                    break;
                default:
                    System.out.println("No choice!!!");
                    System.out.println("Please choice from 1 to 6!!!");
            }
        } while (true);
    }
}
