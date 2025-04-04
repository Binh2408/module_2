package ss1_introduction_to_java.thuc_hanh.operator_expression;

import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
