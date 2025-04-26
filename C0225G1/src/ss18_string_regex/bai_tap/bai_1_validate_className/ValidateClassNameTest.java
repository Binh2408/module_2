package ss18_string_regex.bai_tap.bai_1_validate_className;

import java.util.Scanner;

public class ValidateClassNameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Class Name: ");
        String className = scanner.nextLine();
        ValidateClassName validateClassName = new ValidateClassName();
        if (validateClassName.validate(className)) {
            System.out.println("Class Name is valid");
        } else {
            System.out.println("Class Name is not valid");
        }
    }
}
