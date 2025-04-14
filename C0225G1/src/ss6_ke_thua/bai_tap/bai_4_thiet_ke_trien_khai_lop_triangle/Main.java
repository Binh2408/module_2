package ss6_ke_thua.bai_tap.bai_4_thiet_ke_trien_khai_lop_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh thứ nhất: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh thứ hai: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh thứ ba: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.nextLine();
        System.out.print("Tam giác có được tô màu không? (true/false): ");
        boolean filled = scanner.nextBoolean();
        Triangle triangle = new Triangle(side1,side2,side3,color,filled);
        System.out.println("\n--- Thông tin tam giác ---");
        System.out.println(triangle.toString());
        System.out.println("Màu sắc: " + triangle.getColor());
        System.out.println("Tô màu: " + (triangle.isFilled() ? "Có" : "Không"));
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Diện tích: " + triangle.getArea());
        
    }
}
