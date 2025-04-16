package ss2_loop_in_java.bai_tap.bai_1_hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class ShowMenuDrawRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("student_manager_menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    drawRectangle();
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    drawSquareTriangle();
                    break;
                case 3:
                    System.out.println("Draw isosceles triangle");
                    drawIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("See you again!!!");
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
    
    //hàm vẽ hình chữ nhật
    public static void drawRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //hàm vẽ hình tam giác vuông
    public  static void drawSquareTriangle() {
        System.out.println("Square Triangle has right angle in bottom left");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Square Triangle has right angle in top left");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Square Triangle has right angle in bottom right");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Square Triangle has right angle in top right");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    //hàm vẽ hình tam giác cân
    public static void drawIsoscelesTriangle() {
        int height = 5; // Chiều cao tam giác
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
