package ss15_exception_debug.bai_tap.su_dung_illegal_triangle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        int edge1;
        int edge2;
        int edge3;
        while (true) {
            try {
                System.out.println("Nhập cạnh thứ 1");
                edge1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh thứ 2");
                edge2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh thứ 3");
                edge3 = Integer.parseInt(scanner.nextLine());

                Triangle triangle = new Triangle(edge1,edge2,edge3);
                triangle.setEdge1(-1);
                System.out.println(triangle);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println("Nhập 3 cạnh chưa đúng " + e.getMessage());
                System.out.println("Nhập lại");
            } catch (NumberFormatException e) {
                System.out.println("Lỗi định dạng: " + e.getMessage());
            }
        }
    }

//    public static void checkSide(int a, int b, int c) throws IllegalTriangleException {
//        if (a < 0 || b < 0 || c < 0) {
//            throw new IllegalTriangleException("Lỗi nhập cạnh là âm!!!");
//        } else if (a + b <= c || a + c <= b || b + c <= a) {
//            throw new IllegalTriangleException("Tổng 2 cạnh ko lớn hơn cạnh còn lại");
//        }
//    }
}
