package ss5_access_modifier_static_method_static_property.bai_tap.bai_2_xay_dung_lop_chi_ghi_trong_java;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println(student.toString());
        System.out.println("Enter name to change: ");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.println("Enter classes to change: ");
        String classes = scanner.nextLine();
        student.setClasses(classes);
        System.out.println(student.toString());
    }
}
