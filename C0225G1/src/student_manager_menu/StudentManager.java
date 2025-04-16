package student_manager_menu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    //chứa các phương thức CRUD
    //tạo mảng chứa student
    private static final Student[] students = new Student[100];
    Scanner scanner = new Scanner(System.in);

    static {
        students[0] = new Student(1, 22, "Bình");
        students[1] = new Student(3, 22, "Đông");
        students[2] = new Student(2, 24, "A Khánh");
        students[3] = new Student(4, 26, "A Chung");
    }

    public void display() {
        System.out.println("1. Display by name");
        System.out.println("2. Display by age");
        System.out.println("3. Display by ID (desc)");
        System.out.println("4. Exit to menu");
        int choice = inputInt("Your choice: ");
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                //System.out.println(student.toString());
                count++;
            }
        }
        Student[] newListStudent = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student != null) {
                newListStudent[index++] = student;
            }
        }
        if (choice == 4) {
            return;
        }
        switch (choice) {
            // do nó đang xét theo unicode, String.compareTo chỉ tốt cho chữ ko dâu
            case 1:
                Arrays.sort(newListStudent, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                break;
            case 2:
                Arrays.sort(newListStudent, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getAge()-o2.getAge();
                    }
                });
                break;
            case 3:
                Arrays.sort(newListStudent);
                break;
        }
//        Arrays.sort(newListStudent);
        for (Student student : newListStudent) {
            System.out.println(student);
        }
    }

    public void add() {
        int id = inputInt("Enter student ID: ");
        for (Student student: students) {
            if (student != null && student.getId() == id) {
                System.out.println("ID already exists!Please try again!");
                return;
            }
        }
        String name = inputString("Enter student name: ");
        int age = inputInt("Enter student age: ");
        Student student = new Student(id, age, name);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("Add success!!!");
                return;
            }
        }
        System.out.println("List is full! Cannot add more students.");
    }

    public void delete() {
        String name = inputString("Enter student name to delete: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && name.equalsIgnoreCase(students[i].getName().trim())) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                System.out.println("Delete success!!!");
                return;
            }
        }
        System.out.println("Student not found!!!");
    }

    public void edit() {
        String name = inputString("Enter student name to edit: ");
        for (int i = 0; i < students.length; i++) {
            //equalsIgnoreCase ko phân biệt hoa thường
            if (students[i] != null && name.equalsIgnoreCase(students[i].getName())) {
                int newId = inputInt("Enter new ID: ");
                String newName = inputString("Enter new name: ");
                int newAge = inputInt("Enter new age: ");
                students[i].setId(newId);
                students[i].setName(newName);
                students[i].setAge(newAge);
                System.out.println("Edit success!!!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void search() {
        System.out.println("Enter name student want to find: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().toLowerCase().contains(searchName)) {
                System.out.println(students[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found!!!");
        }
    }

    // Hàm nhập số nguyên an toàn
    private int inputInt(String message) {
        int number;
        while (true) {
            try {
                System.out.print(message);
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

    // Hàm nhập chuỗi không rỗng
    private String inputString(String message) {
        String input;
        while (true) {
            System.out.print(message);
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Input cannot be empty! Please enter again.");
            }
        }
    }
}
