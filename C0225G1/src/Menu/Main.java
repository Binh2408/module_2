package Menu;

import java.util.Scanner;

public class Main {
    static Student[] students = new Student[100];
    static int size = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display(scanner);

    }
    public static void display(Scanner scanner) {
        do {
            System.out.println("--------------------Menu--------------------");
            System.out.println("1. Display All Students");
            System.out.println("2. Add New Students");
            System.out.println("3. Delete Students");
            System.out.println("4. Edit Students");
            System.out.println("5. Search Students in lists");
            System.out.println("6. Exit");
            System.out.println("--------------------------------------------");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 6) {
                System.out.println("See you again!!!");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("List of students");
                    displayListOfStudents();
                    System.out.println("Tổng số sinh viên: " + size);
                    break;
                case 2:
                    System.out.println("Add New Student");
                    addStudent(scanner);
                    break;
                case 3:
                    System.out.println("Delete Students");
                    deleteStudent(scanner);
                    break;
                case 4:
                    System.out.println("Edit Students");
                    editStudent(scanner);
                    break;
                case 5:
                    System.out.println("Search Student");
                    break;
                default:
                    System.out.println("No choice!!!");
                    System.out.println("Please choice from 1 to 6!!!");
            }
        } while (true);
    }

    public static void displayListOfStudents() {
        if (size == 0) {
            System.out.println("No students");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(students[i]);
            }
        }
    }

    public static void addStudent(Scanner scanner) {
        if (size >= students.length) {
            System.out.println("List is full");
            return;
        }
        System.out.println("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name student: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = Integer.parseInt(scanner.nextLine());
        students[size] = new Student(id, age, name);
        size++;
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.println("Enter ID student want to delete");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j+1];
                }
                students[--size] = null;
                System.out.println("Student deleted");
                return;
            }
        }
    }
    public static void editStudent(Scanner scanner) {
        System.out.println("Enter ID student you want to change: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                System.out.println("Enter name: ");
                students[i].setName(scanner.nextLine());
                System.out.println("Enter age: ");
                students[i].setAge(Integer.parseInt(scanner.nextLine()));
                return;
            }
        }
        System.out.println("Student not found!!!");
    }
}
