package student_manager_menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display(scanner);
    }

    public static void display(Scanner scanner) {
        do {
            System.out.println("--------------------Menu--------------------");
            System.out.println("1. Display All Students");
            System.out.println("2. Add New Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Edit Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.println("--------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    displayListOfStudents();
                    break;
                case 2:
                    addStudent(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    editStudent(scanner);
                    break;
                case 5:
                    searchStudent(scanner);
                    break;
                case 6:
                    System.out.println("See you again!!!");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter from 1 to 6.");
            }
        } while (true);
    }

    public static void displayListOfStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println("Total students: " + students.size());
        }
    }

    public static void addStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = Integer.parseInt(scanner.nextLine());
        students.add(new Student(id, age, name));
        System.out.println("Student added successfully.");
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void editStudent(Scanner scanner) {
        System.out.print("Enter student ID to edit: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new age: ");
                student.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void searchStudent(Scanner scanner) {
        System.out.print("Enter student ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Found: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

